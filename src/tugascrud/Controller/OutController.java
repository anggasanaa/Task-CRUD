/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascrud.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import tugascrud.Helper.Helper;
import tugascrud.Model.MainModel;
import tugascrud.Query.OutQuery;

/**
 *
 * @author hello
 */
public class OutController extends BaseController {
    	Helper helper = new Helper();
	OutQuery query = new OutQuery();
	
	public Boolean input(MainModel model) throws ParseException{
		String date = helper.parseDateToString(model.getOutcoming());
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getOutcome_name());
		map.put(2, model.getProduct_id());
		map.put(3, model.getAddress());
		map.put(4, model.getTotal());
		map.put(5, date);
		
		String sql = this.query.outcoming;
		
		return this.preparedStatement(map, sql);
	}
	
	public Boolean update(String id, MainModel model) throws ParseException{
		String date = helper.parseDateToString(model.getOutcoming());
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getOutcome_name());
		map.put(2, model.getProduct_id());
		map.put(3, model.getAddress());
		map.put(4, model.getTotal());
		map.put(5, date);
		map.put(6, id);
		
		String sql = this.query.updateOutcoming;
		
		return this.preparedStatement(map, sql);
	}
	
	public ResultSet get(){
		String sql = this.query.getOutcoming;
		return this.get(sql);
	}
	
	public ResultSet showById(String id){
		String sql = this.query.showByIdOutcoming;
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, id);
		
		return this.getWithParameter(map, sql);
	}
	
	public ResultSet showByProductID(String product_id){
		String sql = this.query.showByNameOutcoming;
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, helper.parseLikeQuery(product_id));
		
		return this.getWithParameter(map, sql);
	}
}
