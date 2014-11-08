
package com.hp;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class readfile {
    private String path;
    public readfile(String file_path)
    {
        path=file_path;
    }
    public String[] openfile()throws IOException
    {
        FileReader fr=new FileReader(path);
        BufferedReader br=new BufferedReader(fr);
         
        int numberoflines=readLines();
        String[] textdata=new String[numberoflines];
        int i;
        for(i=0;i<numberoflines;i++)
        {
            textdata[i]=br.readLine();
            
        }
        br.close();
        return textdata;
    }
    public int readLines() throws FileNotFoundException, IOException 
    {
     FileReader f=new FileReader(path);
     BufferedReader b=new BufferedReader(f);
     String aLine;
     int numberoflines=0;
     while((aLine=b.readLine())!=null)
     {
         numberoflines++;
     }
     b.close();
     return numberoflines;
    
    }
}
    

