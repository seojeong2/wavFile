import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        String originalFilePath = "/Users/seojeong/Desktop/sample.wav";
        String targetFileName = "/Users/seojeong/Desktop/testdir/merge_1G.wav";


        FileOutputStream fileOutputStream = new FileOutputStream(targetFileName);

        for(int i=0; i<3; i++){
            FileInputStream fileInputStream = new FileInputStream(originalFilePath);

            int readByteNo;
            byte[] readBytes = new byte[100];

            while((readByteNo = fileInputStream.read(readBytes)) != -1)
            {
                fileOutputStream.write(readBytes,0,readByteNo);
            }

            fileInputStream.close();
        }


        fileOutputStream.flush();
        fileOutputStream.close();


        System.out.println("복사 완료");
    }
}
