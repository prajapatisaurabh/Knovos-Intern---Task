package hdfsCRUD;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadWriteHDFS {

    public static void main(String[] args) throws IOException {
//        ReadWriteHDFS.readFileFromHDFS();
       // ReadWriteHDFS.appendToHDFSFile();
        ReadWriteHDFS.writeFileToHFDS();
//        ReadWriteHDFS.checkExits();
//            ReadWriteHDFS.createDirectory();
    }

    public static void checkExits() throws IOException {
        Configuration configuration = new Configuration();
        configuration.set("fs.default", "hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(configuration);

        // Create Path
        String directoryName = "java";
        Path path = new Path(directoryName);

        if (fileSystem.exists(path)){
            System.out.println("File/Folder Exits : " + path.getName());
        }else {
            System.out.println("File/Folder does not Exits :" + path.getName());
        }
    }

    public static void createDirectory() throws IOException {
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", "hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(configuration);

        // Create Path
        String directoryName = "java";
        Path path = new Path(directoryName);
        fileSystem.mkdirs(path);
    }

    public static void appendToHDFSFile() throws IOException {
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", "hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(configuration);

        // Create Path
        String fileName = "read_write_hdfs_example.txt";
        Path hdfsReadPath = new Path("/user/java/" + fileName);
        FSDataOutputStream outputStream = fileSystem.append(hdfsReadPath);

        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(outputStream,StandardCharsets.UTF_8));
        bufferedWriter.write("Java API to append data in HDFS file");
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileSystem.close();
    }

    public static void writeFileToHFDS() throws IOException {
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", "hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(configuration);

        // Create Path
        String fileName = "read_write_hdfs_example.txt";
        Path hdfsReadPath = new Path("/user/java/" + fileName);
        FSDataOutputStream outputStream = fileSystem.create(hdfsReadPath,true);

        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(outputStream,StandardCharsets.UTF_8));
        bufferedWriter.write("JAVA API to write data in HDFS");
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileSystem.close();
    }

    public static void readFileFromHDFS() throws IOException{
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", "hdfs://localhost:9000");
        FileSystem fileSystem = FileSystem.get(configuration);

        // Create Path
        String fileName = "read_write_hdfs_example.txt";
        Path hdfsReadPath = new Path("/user/java/" + fileName);

        // Init Input stream
        FSDataInputStream inputStream = fileSystem.open(hdfsReadPath);

        // Classical Input stream
        String out = IOUtils.toString(inputStream,"UTF-8");
        System.out.println(out);

//        BufferedReader bufferedReader = new BufferedReader(
//                new InputStreamReader(inputStream, StandardCharsets.UTF_8));
//        String line = null;
//
//        while ((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }
        inputStream.close();
        fileSystem.close();
    }
}
