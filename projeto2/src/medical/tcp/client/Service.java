package medical.tcp.client;

import java.util.ArrayList;
import tcp.server.services.ServiceLayer;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class Service <E> implements ServiceLayer {
    
    private String resource;
    private String method;
    private ArrayList<E> data;
    private int params;
    
    public Service(String resource, String method) {
        this.resource = resource;
        this.method = method;
    }
    
    public Service(String resource, String method, ArrayList<E> data) {
        this.resource = resource;
        this.method = method;
        this.data = data;
    }

    public Service(String resource, String method, int params) {
        this.resource = resource;
        this.method = method;
        this.params = params;
    }

    @Override
    public String resource() {
        return this.resource;
    }

    @Override
    public String method() {
        return this.method;
    }

    @Override
    public ArrayList<E> data() {
        return this.data;
    }

    @Override
    public int params() {
        return this.params;
    }
}
