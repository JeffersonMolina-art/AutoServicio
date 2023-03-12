package gt.edu.umg.progra3.colas;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class ColaTest implements Cola {
    private Cola cola;
    private LinkedList<String> queue;

    @Before
    public void init(){

        queue = new LinkedList<String>();
        cola = new ColaTest();
        queue.add("Bienvenidos");
        queue.add("a");
        queue.add("Programacion 3");
    }

    @Test
    public void testPushCola(){
        queue.add("testPushPila");
        String cima = peek();
        assert(cima.equals("Bienvenidos"));
    }

    @Test
    public void testPopCola(){
        String cima1 = deque();
        String cima2 = peek();
        assert(cima1.equals("Bienvenidos"));
        assert(cima2.equals("a"));

    }

    @Test
    public void testSizeCola(){
        int t1 = size();
        deque();
        deque();
        int t2 = size();
        assert (t1==3);
        assert (t2==1);
    }

    @Override
    public void enqueue(String item) {
        queue.add(item);
    }

    @Override
    public String deque() {
        return queue.remove();
    }

    @Override
    public String peek() {
        return queue.peek();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
