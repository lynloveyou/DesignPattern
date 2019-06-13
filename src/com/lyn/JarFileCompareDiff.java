package com.lyn;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JarFileCompareDiff{
    public JarFileCompareDiff(){
    }

    public static void main(String[] args){
        String dirMore = "D:\\compare\\lib";
        String dirLess = "D:\\compare\\testlib";
        
        List<String> fileMore = _getFilesNamesCollection(dirMore);
        List<String> fileLess = _getFilesNamesCollection(dirLess);
        fileMore.removeAll(fileLess);
        System.out.println("-more--total--size--"+fileMore.size());
        for(String fileName:fileMore)
        {
            System.out.println(fileName);
        }
        fileMore = _getFilesNamesCollection(dirMore);
        fileLess = _getFilesNamesCollection(dirLess);
        fileLess.removeAll(fileMore);
        System.out.println("-less--total--size--"+fileLess.size());
        for(String fileName:fileLess)
        {
            System.out.println(fileName);
        }
    }
    
    private static List<String> _getFilesNamesCollection(String path)
    {
        List<String> files = new ArrayList<String>();
        File filedirmore = new File(path);
        File[] listFiles = filedirmore.listFiles();
        for(File file:listFiles)
        {
            files.add(file.getName());
        }
        return files;
    }
}
