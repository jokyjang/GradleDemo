package zzx.webapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class HelloServletTest {
    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private RequestDispatcher dispatcher;

    private HelloServlet servlet = new HelloServlet();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void doGet() throws IOException {
        StringWriter writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);

        when(response.getWriter()).thenReturn(printWriter);
        servlet.doGet(request, response);

        assertEquals("Hello, World!", writer.toString());
    }

    @Test
    public void doPost() throws ServletException, IOException {
        when(request.getRequestDispatcher("response.jsp")).thenReturn(dispatcher);

        servlet.doPost(request, response);

        verify(request).setAttribute("user", "World");
        verify(dispatcher, times(1)).forward(request, response);
    }

    @Test
    public void doPost_withName() throws ServletException, IOException {
        when(request.getParameter("name")).thenReturn("haha");
        when(request.getRequestDispatcher("response.jsp")).thenReturn(dispatcher);

        servlet.doPost(request, response);

        verify(request).setAttribute("user", "haha");
        verify(dispatcher, times(1)).forward(request, response);
    }
}
