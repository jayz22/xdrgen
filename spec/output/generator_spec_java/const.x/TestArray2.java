// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package MyXDR;


import java.io.IOException;

import java.util.Arrays;

// === xdr source ============================================================

//  typedef int TestArray2<FOO>;

//  ===========================================================================
public class TestArray2 implements XdrElement {
  private Integer[] TestArray2;

  public TestArray2() {}

  public TestArray2(Integer[] TestArray2) {
    this.TestArray2 = TestArray2;
  }

  public Integer[] getTestArray2() {
    return this.TestArray2;
  }

  public void setTestArray2(Integer[] value) {
    this.TestArray2 = value;
  }

  public static void encode(XdrDataOutputStream stream, TestArray2  encodedTestArray2) throws IOException {
    int TestArray2size = encodedTestArray2.getTestArray2().length;
    stream.writeInt(TestArray2size);
    for (int i = 0; i < TestArray2size; i++) {
      stream.writeInt(encodedTestArray2.TestArray2[i]);
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static TestArray2 decode(XdrDataInputStream stream) throws IOException {
    TestArray2 decodedTestArray2 = new TestArray2();
    int TestArray2size = stream.readInt();
    decodedTestArray2.TestArray2 = new Integer[TestArray2size];
    for (int i = 0; i < TestArray2size; i++) {
      decodedTestArray2.TestArray2[i] = stream.readInt();
    }
    return decodedTestArray2;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.TestArray2);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof TestArray2)) {
      return false;
    }

    TestArray2 other = (TestArray2) object;
    return Arrays.equals(this.TestArray2, other.TestArray2);
  }
}
