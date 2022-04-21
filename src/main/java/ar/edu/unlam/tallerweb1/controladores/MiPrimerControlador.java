package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiPrimerControlador {

	@RequestMapping(path="/miprimerurl", method=  RequestMethod.GET)
	public ModelAndView miprimervista() {
		
		return new ModelAndView("vista1");
	}
	
//	@RequestMapping(path="/segundavista", method=  RequestMethod.GET)
//	public ModelAndView misegundavista(@RequestParam(value="n") String nombre, 
//			@RequestParam(value="a") String apellido) {
//		
//		ModelMap modelo = new ModelMap();
//		modelo.put("mensaje1", "Hola hoy es jueves");
//		modelo.put("mensaje2", "21");
//		modelo.put("apellido", apellido);
//		modelo.put("nombre", nombre);
//		
//		return new ModelAndView("vista2", modelo);
//	}
	
	@RequestMapping(path="/segundavista/categoria/{nombreCategoria}", method=  RequestMethod.GET)
	public ModelAndView misegundavista(@PathVariable(value="nombreCategoria") String nombreCategoria) {
		
		ModelMap modelo = new ModelMap();
		modelo.put("mensaje1", "Hola hoy es jueves");
		modelo.put("mensaje2", "21");
		//modelo.put("apellido", apellido);
		//modelo.put("nombre", nombre);
		modelo.put("categoria", nombreCategoria);
		
		return new ModelAndView("vista2", modelo);
	}
	
	@RequestMapping(path="/operacion")
	public ModelAndView operacion(@RequestParam(value="operando1") Integer operando1, 
			@RequestParam(value="operando2") Integer operando2) {
		ModelMap modelo = new ModelMap();
		Integer resultado = operando1+operando2;
		modelo.put("resultado", resultado);
		
		return new ModelAndView("operacion", modelo);
	}
	
}
