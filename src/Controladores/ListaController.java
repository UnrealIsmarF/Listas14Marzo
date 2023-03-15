
package Controladores;

import Modelos.Clientes;
import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;


public class ListaController implements ActionListener {
frmListas VistaLista;
ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        //poner escucha botones
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        
        //Levantar vista lista
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == this.VistaLista.btnIngresarCliente)
     {
         this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText() ,
                 this.VistaLista.txtNombre.getText());
         
         //Mostrar Los datos en el text Area
         Queue <Clientes> ListaLocal = this.ModeloLista.ListarClientes();
         
            String Cadena = "";
        for(Clientes MiListaClientes: ListaLocal)
        {
            Cadena = Cadena + MiListaClientes.getApellidos()+ " " + MiListaClientes.getNombre()+ "\n";
            this.VistaLista.txtListaClientes.setText(Cadena);
        }
     }
        
        
    }
    
}
