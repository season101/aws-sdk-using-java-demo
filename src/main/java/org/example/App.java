package org.example;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            String bucketName = "samplemybucket112233hawa";

            AmazonS3ClientBuilder s3ClientBuilder = AmazonS3ClientBuilder.standard();

            final AmazonS3 s3 = s3ClientBuilder.withRegion(Regions.US_WEST_2).build();

            System.out.println(s3.createBucket(bucketName));
        } catch (AmazonServiceException e) {
            System.out.println(e.getErrorMessage());
        }
    }
}
