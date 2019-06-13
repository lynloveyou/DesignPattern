import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RestartCheck{
    private static final int a = 3;
    private static int b=2;
    private static int c;
    private int k;
    private int k2;
    static{
        c=3;
    }
    
    public RestartCheck(){
    }
    
    private static int _checkUnSyncCount(String url) throws Exception
    {
        //设置查询URL
        URL urlinstance = new URL(url);
        HttpURLConnection urlCon = (HttpURLConnection)urlinstance.openConnection();
        urlCon.setConnectTimeout(150000);
        urlCon.setReadTimeout(150000);
        //setConnectTimeout：设置连接主机超时（单位：毫秒）
        //setReadTimeout：设置从主机读取数据超时（单位：毫秒）
        InputStream inputStream = urlCon.getInputStream();
        BufferedInputStream in = new BufferedInputStream(inputStream);
        List<byte[]> readList = new ArrayList<byte[]>();
        byte[] readBytes = new byte[1024];
        int total = 0;
        for(int read =0; (read=in.read(readBytes))!=-1;readBytes = new byte[1024])
        {
            total = total+read;
            readList.add(readBytes);
        }
        byte[] totalBytes = new byte[total];
        for(int i=0;i<readList.size();i++)
        {
            int length = 1024;
            byte[] bs = readList.get(i);
            if(i+1==readList.size())
            {
                length =  total-i*1024;
            }
            System.arraycopy(bs, 0, totalBytes, i*1024, length);
        }
        String content = new String(totalBytes,"UTF-8").trim();
        if(!content.equals(""))
        {
            return Integer.valueOf(content).intValue();
        }
        return 0;
    }
    
    public static void main(String[] args){
        //获取地址内容
        try{
            int _checkUnSyncCount = _checkUnSyncCount("http://127.0.0.1:16889/mc/mc/check/fuelpos.json?sign=windtrendToken");
            System.out.println("----------------fuelpos-unsync--result="+_checkUnSyncCount);
            if(_checkUnSyncCount>0)
            {
                //执行重启服务
                System.out.println("-----重启服务----");
                _restart();
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private static void _restart()
    {
        if(_isWindows())
        {
            _restartByCMD();    
        }else
        {
            _restartByShell();
        }
    }
    private static void _restartByCMD()
    {
        Runtime runtime = Runtime.getRuntime();
        try {
            String[] cmdCommand = {"cmd","/c","start restart.bat&&exit"};
            //Process exec = runtime.exec("cmd /c  del /s/q "+url);
            Process exec = runtime.exec(cmdCommand);
            int waitFor = exec.waitFor();
            exec.destroy();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
    
    //通过
    private static void _restartByShell()
    {
        Runtime runtime = Runtime.getRuntime();
        try {
            String[] cmdCommand = {"/bin/sh","-c","./restart.sh"};
            Process exec = runtime.exec(cmdCommand);
            int waitFor = exec.waitFor();
            exec.destroy();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
    
    private static boolean _isWindows()
    {
        String osName = System.getProperty("os.name");
        return osName.indexOf("Windows")!=-1;
    }
    
}
