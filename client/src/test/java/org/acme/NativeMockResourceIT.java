package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeMockResourceIT extends MockResourceTest {

    // Execute the same tests but in native mode.
}