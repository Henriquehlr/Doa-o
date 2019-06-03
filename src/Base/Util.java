
package Base;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Util {
    
    
//    Este metado ira centralizar um container
    public static void centralizar(Container janela){
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension d = tool.getScreenSize();
        
//        Operação feita para realizar a posição
        int posiçãoX = (d.width = janela.getWidth()) / 2;
        int posiçãoY = (d.height = janela.getHeight()) / 2;
        janela.setLocation(posiçãoX, posiçãoY);;
        
        
    }
    
}
