package org.apache.flink.fs.s3hadoop;

import org.apache.flink.core.fs.RecoverableWriter;
import org.apache.flink.runtime.fs.hdfs.HadoopFileSystem;
import org.apache.hadoop.fs.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class DeltaFileSystem extends HadoopFileSystem {
    public DeltaFileSystem(FileSystem hadoopFileSystem) {
        super(hadoopFileSystem);
    }

    @Override
    public RecoverableWriter createRecoverableWriter() throws IOException {
        return new DeltaRecoverableWriter();
    }
}
