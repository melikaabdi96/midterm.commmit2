package com.company.utils;


import com.company.model.ClassModel;

import java.io.*;

/**
 * This class holds files of classes
 * @author Melika
 * @since 2020
 */
public class ClassFile {

    private static final String CLASS_PATH = "./classes/";

    //It's a static initializer. It's executed when the class is loaded.
    static {
        boolean isSuccessful = new File(CLASS_PATH).mkdirs();
        System.out.println("Creating " + CLASS_PATH + " directory is successful: " + isSuccessful);
    }

    /**
     * @return list of files
     */
    public static File[] getFilesInDirectory() {
        return new File(CLASS_PATH).listFiles();
    }


    /*public static String fileReader(File file) {
        FileReader fileReader;
        String reader ="";
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()){
                reader += bufferedReader.readLine() + "\n";
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reader;
    }*/

   /* public static void fileWriter(String content) {
        String fileName = getProperFileName(content);
        FileWriter fileWriter;
        File file = new File(fileName);
        try {
            fileWriter = new FileWriter(NOTES_PATH + file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/



    /*public static String fileReaderInputStream(File file){
        String reader = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (fileInputStream.available() > 0){
                reader += (char) fileInputStream.read();
            }
            fileInputStream.close();
        } catch (FileNotFoundException e){
            //Logger.getLogger(JavaFileManager.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        } /*catch (IOException e){
            e.printStackTrace();
        }*/

    /*public static void fileWriterOutputStream(String content) throws FileNotFoundException {
        String fileName = getProperFileName(content);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            char[] chars = content.toCharArray();
            byte[] bytes = new byte[chars.length];
            for (int i = 0; i < bytes.length; i++){
                bytes[i] = (byte) chars[i];
            }
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (FileNotFoundException e){
            //Logger.getLogger(JavaFileManager.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        } /*catch (IOException e){
            e.printStackTrace();
        }*/

    public static void objectFileWriter(ClassModel classModel){
        String fileName = CLASS_PATH + classModel.getName() + classModel.getDate();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(classModel);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ClassModel objectFileReader(File file){
        ClassModel classModel = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            classModel = (ClassModel) objectInputStream.readObject();
            objectInputStream.close();
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return classModel;
    }

    /*private static String getProperFileName(String content) {
        int loc = content.indexOf("\n");
        if (loc != -1) {
            return content.substring(0, loc);
        }
        if (!content.isEmpty()) {
            return content;
        }
        return System.currentTimeMillis() + "_new file.txt";
    }*/
}

