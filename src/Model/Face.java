package Model;
//!!!!!Pas certain d'utiliser cette interface!!!!!
public interface Face {

	/**
	 * D�finit la face
	 * @param nbFace
	 */
	public void setFace(int nbFace);
	
	
	/**
	 * Retourne true si la face n'est compos� que d'une couleur
	 * @return
	 */
	public void isComplete();
	
}
