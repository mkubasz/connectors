package org.apache.flink.fs.plugins;

import org.apache.flink.core.fs.*;
import org.apache.flink.core.fs.BlockLocation;
import org.apache.flink.core.fs.FSDataInputStream;
import org.apache.flink.core.fs.FSDataOutputStream;
import org.apache.flink.core.fs.FileStatus;
import org.apache.flink.core.fs.Path;
import org.apache.flink.runtime.fs.hdfs.HadoopFileSystem;

import java.io.IOException;
import java.net.URI;


public class DeltaFileSystem extends  GSFileSystem {

    @Override
    public Path getWorkingDirectory() {
        return null;
    }

    @Override
    public Path getHomeDirectory() {
        return null;
    }

    @Override
    public URI getUri() {
        return null;
    }

    @Override
    public FileStatus getFileStatus(Path path) throws IOException {
        return null;
    }

    @Override
    public BlockLocation[] getFileBlockLocations(FileStatus fileStatus, long l, long l1) throws IOException {
        return new BlockLocation[0];
    }

    @Override
    public FSDataInputStream open(Path path, int i) throws IOException {
        return null;
    }

    @Override
    public FSDataInputStream open(Path path) throws IOException {
        return null;
    }

    @Override
    public FileStatus[] listStatus(Path path) throws IOException {
        return new FileStatus[0];
    }

    @Override
    public boolean delete(Path path, boolean b) throws IOException {
        return false;
    }

    @Override
    public boolean mkdirs(Path path) throws IOException {
        return false;
    }

    @Override
    public FSDataOutputStream create(Path path, WriteMode writeMode) throws IOException {
        return null;
    }

    @Override
    public boolean rename(Path path, Path path1) throws IOException {
        return false;
    }

    @Override
    public boolean isDistributedFS() {
        return false;
    }

    @Override
    public FileSystemKind getKind() {
        return null;
    }
}
