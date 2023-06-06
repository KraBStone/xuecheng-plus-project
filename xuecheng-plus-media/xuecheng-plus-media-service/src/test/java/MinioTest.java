import com.alibaba.nacos.common.utils.IoUtils;
import com.j256.simplemagic.ContentInfo;
import com.j256.simplemagic.ContentInfoUtil;
import io.minio.*;
import io.minio.errors.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Title: MinioTest
 * @Author XLW
 * @Package PACKAGE_NAME
 * @Date 2023/6/6 21:46
 * @description:
 */
public class MinioTest {


    MinioClient minioClient =
            MinioClient.builder()
                    .endpoint("http://192.168.101.65:9000")
                    .credentials("minioadmin", "minioadmin")
                    .build();


    //上传文件
    @Test
    public void test_upload() throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {


        //通过扩展名获得媒体资源类型 mimeType
        ContentInfo extensionMatch = ContentInfoUtil.findExtensionMatch(".mp4");
        String mimeType = MediaType.APPLICATION_OCTET_STREAM_VALUE;//通用mimeType，字节流


        //上传文件的参数信息
        UploadObjectArgs uploadObjectArgs = UploadObjectArgs.builder()
                .bucket("testbucket") //确定桶
                .filename("D:\\lesson\\1.mp4") //指定本地文件路径
                .object("test/01/1.mp4") //对象名
                .contentType("video/mp4") //设置文件类型
                .build();

        //上传文件
        minioClient.uploadObject(uploadObjectArgs);


    }


    //删除文件
    @Test
    public void test_delete() throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        //删除文件的参数信息
        RemoveObjectArgs removeObjectArgs = RemoveObjectArgs.builder().bucket("testbucket").object("1.mp4").build();

        //删除文件
        minioClient.removeObject(removeObjectArgs);


    }

    //查询文件 从minio中下载文件
    @Test
    public void test_getFile() throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        GetObjectArgs getObjectArgs = GetObjectArgs.builder().bucket("testbucket").object("test/01/1.mp4").build();

        FilterInputStream inputStream = minioClient.getObject(getObjectArgs);

        //指定输出流
        FileOutputStream outputStream = new FileOutputStream(new File("D:\\lesson\\1a.mp4"));

        IoUtils.copy(inputStream,outputStream);

        //校验文件的完整性 对文件的内容md5
        String source_md5 = DigestUtils.md5Hex(inputStream); //minio中文件的md5

        String local_md5 = DigestUtils.md5Hex(new FileInputStream(new File("D:\\lesson\\1a.mp4")));

        if (source_md5.equals(local_md5)){
            System.out.println("success");
        }


    }
}
