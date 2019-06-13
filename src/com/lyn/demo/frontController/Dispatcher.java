package com.lyn.demo.frontController;

import java.util.HashMap;
import java.util.Map;

import com.lyn.demo.frontController.impl.DefaultNilView;
import com.lyn.demo.frontController.impl.HomeView;
import com.lyn.demo.frontController.impl.StudentView;

/**
 * 调度器 
 */
public class Dispatcher{
    private static String DEFAULTPATH = "";
    private static Map<String,ViewInterface> viewMapper = new HashMap<String,ViewInterface>();
    private static Dispatcher dispatcher;
    static
    {
        ViewInterface homeView = new HomeView();
        ViewInterface studentView = new StudentView();
        ViewInterface defaultView = new DefaultNilView();
        viewMapper.put(homeView.getPath(), homeView);
        viewMapper.put(studentView.getPath(), studentView);
        viewMapper.put(defaultView.getPath(), defaultView);
    }

    private Dispatcher(){}
    
    public static synchronized Dispatcher getInstance()
    {
        if(dispatcher==null)
        {
            dispatcher = new Dispatcher();
        }
        return dispatcher;
    }
    
    public ViewInterface dispath(String requestURL)
    {
        ViewInterface viewInterface = viewMapper.get(requestURL);
        if(viewInterface==null)
        {
            return viewMapper.get(DEFAULTPATH);
        }
        return viewInterface;
    }
    
}
