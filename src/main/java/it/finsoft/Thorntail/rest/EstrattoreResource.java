package it.finsoft.Thorntail.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import it.finsoft.Thorntail.rest.beans.ODataDataBean;
import it.finsoft.Thorntail.rest.beans.ODataValueBean;

@Stateless
@Path("/")
public class EstrattoreResource {

	@Inject
	EstrattoriManager manager;

	@GET
	@Path("Estrattori")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ODataDataBean prendiRecord() {

		ODataDataBean lista = new ODataDataBean();

		lista.setData(manager.findAll());

		return lista;

	}

	@GET
	@Path("Estrattori({idProcedura})")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ODataValueBean prendiUnRecord(@PathParam("idProcedura") int idProcedura) {

		ODataValueBean x = new ODataValueBean();
		x.setValue(manager.findOne(idProcedura));
		return x;

	}

	@POST
	@Path("Estrattori/StopAllInitial")
	public void stopAllInitial() {

		manager.stopProcedure();
	}

	@POST
	@Path("Estrattori/Run({ids})")
	public void lanciaEstrattore(@PathParam("ids") String lista) {

		String[] listaSplittata = lista.split(",");

		//List<Integer> listIntegers = Arrays.stream(listaSplittata).map(Integer::valueOf).collect(Collectors.toList());
		
		List<Integer> listIntegers = new ArrayList<Integer>(listaSplittata.length);
		for (String current : listaSplittata) {
			listIntegers.add(Integer.parseInt(current));
		}

		manager.runProcedure(listIntegers);

	}

}
