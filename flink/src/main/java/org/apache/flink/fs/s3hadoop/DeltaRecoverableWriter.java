package org.apache.flink.fs.s3hadoop;

import org.apache.flink.core.fs.Path;
import org.apache.flink.core.fs.RecoverableFsDataOutputStream;
import org.apache.flink.core.fs.RecoverableWriter;
import org.apache.flink.core.io.SimpleVersionedSerializer;

import java.io.IOException;
class A implements SimpleVersionedSerializer {

    @Override
    public int getVersion() {
        return 0;
    }

    @Override
    public byte[] serialize(Object o) throws IOException {
        return new byte[0];
    }

    @Override
    public Object deserialize(int i, byte[] bytes) throws IOException {
        return null;
    }
}

class B extends RecoverableFsDataOutputStream {

    @Override
    public RecoverableWriter.ResumeRecoverable persist() throws IOException {
        return null;
    }

    @Override
    public Committer closeForCommit() throws IOException {
        return null;
    }

    @Override
    public long getPos() throws IOException {
        return 0;
    }

    @Override
    public void write(int b) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void sync() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}

class C extends RecoverableFsDataOutputStream {
    @Override
    public RecoverableWriter.ResumeRecoverable persist() throws IOException {
        return null;
    }

    @Override
    public Committer closeForCommit() throws IOException {
        return null;
    }

    @Override
    public long getPos() throws IOException {
        return 0;
    }

    @Override
    public void write(int b) throws IOException {

    }

    @Override
    public void flush() throws IOException {

    }

    @Override
    public void sync() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
public class DeltaRecoverableWriter implements RecoverableWriter {
    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public RecoverableFsDataOutputStream open(Path path) throws IOException {
        return new C();
    }

    @Override
    public RecoverableFsDataOutputStream recover(ResumeRecoverable resumeRecoverable) throws IOException {
        return null;
    }

    @Override
    public boolean requiresCleanupOfRecoverableState() {
        return false;
    }

    @Override
    public boolean cleanupRecoverableState(ResumeRecoverable resumeRecoverable) throws IOException {
        return false;
    }

    @Override
    public RecoverableFsDataOutputStream.Committer recoverForCommit(CommitRecoverable commitRecoverable) throws IOException {
        return null;
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public SimpleVersionedSerializer<CommitRecoverable> getCommitRecoverableSerializer() {
        return  new A();
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public SimpleVersionedSerializer<ResumeRecoverable> getResumeRecoverableSerializer() {
        return new A();
    }

    @Override
    public boolean supportsResume() {
        return false;
    }
}
