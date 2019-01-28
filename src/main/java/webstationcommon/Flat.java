package webstationcommon;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="FLAT_FLATS")
public class Flat {

	@Id
	@Column(name="ID_FLAT")
	@GeneratedValue(strategy = GenerationType.AUTO, generator="native")
	@GenericGenerator(name = "native", strategy = "native")
	private long flatId;

	@Column(name="TITLE", length = 50)
	private String title;

	@Column(name="DESCRIPTION", length = 150)
	private String description;

	@Column(name="NB_PERSONNES", length = 150)
	private String nbPersonnes;

	@Column(name="SDBWC")
	private boolean sdbwc;

	@Column(name="PETS")
	private boolean pets;

	@Column(name="WIFI")
	private boolean wifi;

	@Column(name="ORIENTATION", length = 150)
	private String orientation;

	public Flat() {}
	public Flat(long flatId, String title, String description, String nbPersonnes, boolean sdbwc, boolean pets, boolean wifi, String orientation) {
		this.flatId = flatId;
		this.title = title;
		this.description = description;
		this.nbPersonnes = nbPersonnes;
		this.sdbwc = sdbwc;
		this.pets = pets;
		this.wifi = wifi;
		this.orientation = orientation;
	}

	public long getFlatId() { return flatId; }
	public void setFlatId(long flatId) { this.flatId = flatId; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	public String getNbPersonnes() { return nbPersonnes; }
	public void setNbPersonnes(String nbPersonnes) { this.nbPersonnes = nbPersonnes; }
	public String getOrientation() { return orientation; }
	public void setOrientation(String orientation) { this.orientation = orientation; }
	public boolean getSdbwc() { return sdbwc; }
	public void setSdbwc(boolean sdbwc) { this.sdbwc = sdbwc; }
	public boolean getPets() { return pets; }
	public void setPets(boolean pets) { this.pets = pets; }
	public boolean getWifi() { return wifi; }
	public void setWifi(boolean wifi) { this.wifi = wifi; }

}
