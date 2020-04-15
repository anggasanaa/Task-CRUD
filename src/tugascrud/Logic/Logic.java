/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascrud.Logic;

import tugascrud.Model.MainModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hello
 */
public class Logic {
    	public Boolean checkName(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
		Matcher matchername = pattern.matcher(name);
		return matchername.matches();
	}
}
