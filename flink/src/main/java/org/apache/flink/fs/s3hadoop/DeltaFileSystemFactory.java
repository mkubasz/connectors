package org.apache.flink.fs.s3hadoop;

import org.apache.flink.core.fs.FileSystem;
import org.apache.flink.core.fs.FileSystemFactory;
import org.apache.hadoop.fs.s3a.S3AFileSystem;

import java.io.IOException;
import java.net.URI;

public class S3FileSystemFactory implements FileSystemFactory {
    @Override
    public String getScheme() {
        return "s3a";
    }

    @Override
    public FileSystem create(URI uri) throws IOException {
        return new DeltaFileSystem(new S3AFileSystem());
    }
}
