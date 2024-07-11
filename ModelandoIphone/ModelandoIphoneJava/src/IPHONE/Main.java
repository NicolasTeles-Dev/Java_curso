package IPHONE;

public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        
        // Testando funções do reprodutor musical
        myiPhone.play();
        myiPhone.pause();
        myiPhone.next();
        myiPhone.previous();
        
        // Testando funções do telefone
        myiPhone.makeCall("123456789");
        myiPhone.receiveCall("987654321");
        myiPhone.sendMessage("123456789", "Hello!");

        // Testando funções do navegador
        myiPhone.loadPage("http://example.com");
        myiPhone.navigate("http://another-example.com");
        myiPhone.refresh();
    }
}