import com.github.bigDataTools.hadoop.HdfsManager;

import java.io.File;
import java.io.IOException;

/**
 * Created by winstone on 2017/5/4.
 */
public class TestHdfs {

    public static void main(String[] args) {

        try {
            //boolean flag = HdfsManager.mkRootDir("test");
            /*String localPath="F:\\tmp\\ppp1.mp4";
            String ipPath="hdfs://hadoop16:9000/ppp.mp4";
            boolean flag = HdfsManager.downloadFile(ipPath,localPath,true);*/

/*

            String localPath="D:\\BaiduNetdiskDownload\\bb.txt";
            String hdfsPath="hdfs://node1:9000/";
            File file = new File(localPath);
            boolean flag = HdfsManager.uploadFile(file, hdfsPath,true);
            System.out.println(flag);
*/


            String textTdfsPath="hdfs://node1:9000/bb.txt";
            HdfsManager.createAndAppendFile(textTdfsPath,"xiaoming nihao  xiaoli hello");

            String str = HdfsManager.getHdfsText(textTdfsPath);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
