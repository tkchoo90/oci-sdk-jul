package Implementation;

import Interface.IJmsSdk;

public class JmsSdk implements IJmsSdk {
    @Override
    public String helloWorld() {
        return "Hello World!";
    }
}
