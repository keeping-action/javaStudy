package com.cool.study.file;


import java.io.*;

/**
 * Created by cool on 16/7/19.
 */
public class ReadFileContent {


    public static void readFileByFileReader(String filePath){

        File file=new File(filePath);

        try {
            FileReader fileReader=new FileReader(file);

            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String str;
            while ((str=bufferedReader.readLine()) !=null){

                System.out.println(str);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void readFileByInputSteam(String filePath){

        File file=new File(filePath);

        try {

            InputStream inputStream=new FileInputStream(file);

            byte [] bytes=new byte[10];
            int i;
            while ((i=inputStream.read(bytes)) !=-1 ){

                System.out.println(new String(bytes,0,i,"iso8859-1"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

       // readFileByFileReader("/Applications/redis-3.0.0/data/dump.rdb");
        readFileByInputSteam("/Applications/redis-3.0.0/data/dump.rdb");
    }
}
