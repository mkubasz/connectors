package org.apache.flink.fs.plugins;

import org.apache.flink.core.fs.FileSystem;
import org.apache.flink.fs.DeltaFileSystem;
import org.apache.flink.core.fs.FileSystemFactory;

import java.io.IOException;
import java.net.URI;

public class DeltaFileSystemFactory implements FileSystemFactory {

    @Override
    public String getScheme() {
        return "s3";
    }

    @Override
    public FileSystem create(URI uri) throws IOException {
        return  new DeltaFileSystem(null);
    }
}
