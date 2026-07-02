package com.exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testMockingAndStubbing() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        
        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        
        assertEquals("Mock Data", result);
    }

    @Test
    public void testVerifyingInteractions() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        
        service.pushData("Hello API");
        
        verify(mockApi).sendData("Hello API");
    }
}
