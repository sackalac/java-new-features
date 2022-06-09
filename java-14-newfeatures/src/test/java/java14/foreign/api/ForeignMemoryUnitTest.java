package java14.foreign.api;

import jdk.incubator.foreign.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

public class ForeignMemoryUnitTest {

    @Test
    public void whenAValueIsSet_thenAccessTheValue() {
        long value = 10;
        MemoryAddress memoryAddress = MemorySegment.allocateNative(8).address();
        VarHandle varHandle = MemoryHandles.varHandle(long.class,
                ByteOrder.nativeOrder());
        varHandle.set(memoryAddress, value);
        assertThat(varHandle.get(memoryAddress), is(value));
    }

    @Test
    public void whenMultipleValuesAreSet_thenAccessAll() {
        VarHandle varHandle = MemoryHandles.varHandle(int.class,
                ByteOrder.nativeOrder());

        try(MemorySegment memorySegment =
                    MemorySegment.allocateNative(100)) {
            MemoryAddress base = memorySegment.address();
            for(int i=0; i<25; i++) {
                varHandle.set(base.addOffset((i*4)), i);
            }
            for(int i=0; i<25; i++) {
                assertThat(varHandle.get(base.addOffset((i*4))), is(i));
            }
        }
    }

    @Test
    public void whenSetValuesWithMemoryLayout_thenTheyCanBeRetrieved() {
        SequenceLayout sequenceLayout =
                MemoryLayout.ofSequence(25,
                        MemoryLayout.ofValueBits(64, ByteOrder.nativeOrder()));
        VarHandle varHandle =
                sequenceLayout.varHandle(long.class,
                        MemoryLayout.PathElement.sequenceElement());

        try(MemorySegment memorySegment =
                    MemorySegment.allocateNative(sequenceLayout)) {
            MemoryAddress base = memorySegment.address();
            for(long i=0; i<sequenceLayout.elementCount().getAsLong(); i++) {
                varHandle.set(base, i, i);
            }
            for(long i=0; i<sequenceLayout.elementCount().getAsLong(); i++) {
                assertThat(varHandle.get(base, i), is(i));
            }
        }
    }

    @Test
    public void whenSlicingMemorySegment_thenTheyCanBeAccessedIndividually() {
//        MemoryAddress memoryAddress =
//                MemorySegment.allocateNative(12).address();
//        MemoryAddress memoryAddress1 =
//                memoryAddress.segmentOffset().asSlice(0,4).address();
//        MemoryAddress memoryAddress2 =
//                memoryAddress.segmentOffset().asSlice(4,4).address();
//        MemoryAddress memoryAddress3 =
//                memoryAddress.segment().asSlice(8,4).address();
//
//        VarHandle intHandle =
//                MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());
//        intHandle.set(memoryAddress1, Integer.MIN_VALUE);
//        intHandle.set(memoryAddress2, 0);
//        intHandle.set(memoryAddress3, Integer.MAX_VALUE);
//
//        assertThat(intHandle.get(memoryAddress1), is(Integer.MIN_VALUE));
//        assertThat(intHandle.get(memoryAddress2), is(0));
//        assertThat(intHandle.get(memoryAddress3), is(Integer.MAX_VALUE));
    }

}
