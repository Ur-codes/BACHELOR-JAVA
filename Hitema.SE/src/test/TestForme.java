package test;

import model.Dessinateur;

public class TestForme {

	public static void main(String[] args) {
		
		Dessinateur d1 = new Dessinateur();
		
		d1.addForme(model.Forme.forme.Ligne);
		d1.addForme(model.Forme.forme.Triangle);
		d1.addForme(model.Forme.forme.Rectangle);
		d1.addForme(model.Forme.forme.Rectangle);
		d1.addForme(model.Forme.forme.Rectangle);
		d1.addForme(model.Forme.forme.Rectangle);
		d1.addForme(model.Forme.forme.Rectangle);
		System.out.println(d1.getListeForme());
		d1.CreateForm(d1.getListeForme());

	}

}
