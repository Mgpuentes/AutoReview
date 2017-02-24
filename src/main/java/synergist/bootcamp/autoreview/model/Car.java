package synergist.bootcamp.autoreview.model;

public class Car {
	
	private Integer id;
	private String VClass;
	private String make;
	private String model;
	private String year;
	private String engine;
	private String displ;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVClass() {
		return VClass;
	}

	public void setClass(String VClass) {
		this.VClass = VClass;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDispl() {
		return displ;
	}

	public void setDispl(String displ) {
		this.displ = displ;
	}

	public String getCylinders() {
		return cylinders;
	}

	public void setCylinders(String cylinders) {
		this.cylinders = cylinders;
	}

	public String getForcedInduction() {
		return forcedInduction;
	}

	public void setForcedInduction(String forcedInduction) {
		this.forcedInduction = forcedInduction;
	}

	public String getEngId() {
		return engId;
	}

	public void setEngId(String engId) {
		this.engId = engId;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public String getPrimaryFuel() {
		return primaryFuel;
	}

	public void setPrimaryFuel(String primaryFuel) {
		this.primaryFuel = primaryFuel;
	}

	public String getMpgCity() {
		return mpgCity;
	}

	public void setMpgCity(String mpgCity) {
		this.mpgCity = mpgCity;
	}

	public String getMpgHighway() {
		return mpgHighway;
	}

	public void setMpgHighway(String mpgHighway) {
		this.mpgHighway = mpgHighway;
	}

	public String getMpgCombined() {
		return mpgCombined;
	}

	public void setMpgCombined(String mpgCombined) {
		this.mpgCombined = mpgCombined;
	}

	public String getAlternateFuel() {
		return alternateFuel;
	}

	public void setAlternateFuel(String alternateFuel) {
		this.alternateFuel = alternateFuel;
	}

	public String getGuzzlerTax() {
		return guzzlerTax;
	}

	public void setGuzzlerTax(String guzzlerTax) {
		this.guzzlerTax = guzzlerTax;
	}

	public String getTailpipeCO2Gpm() {
		return tailpipeCO2Gpm;
	}

	public void setTailpipeCO2Gpm(String tailpipeCO2Gpm) {
		this.tailpipeCO2Gpm = tailpipeCO2Gpm;
	}

	private String cylinders;
	private String forcedInduction;
	private String engId;
	private String transmission;
	private String drive;
	private String primaryFuel;
	private String mpgCity;
	private String mpgHighway;
	private String mpgCombined;
	private String alternateFuel;
	private String guzzlerTax;
	private String tailpipeCO2Gpm;
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Review [make=" + make + ", id=" + id + ", Class=" + VClass + ", model=" + model + ", year=" + year
				+ ", engine=" + engine + ", displ=" + displ + ", cylinders=" + cylinders + ", forcedInduction="
				+ forcedInduction + ", engId=" + engId + ", transmission=" + transmission + ", drive=" + drive
				+ ", primaryFuel=" + primaryFuel + ", mpgCity=" + mpgCity + ", mpgHighway=" + mpgHighway
				+ ", mpgCombined=" + mpgCombined + ", alternateFuel=" + alternateFuel + ", guzzlerTax=" + guzzlerTax
				+ ", tailpipeCO2Gpm=" + tailpipeCO2Gpm + ", getId()=" + getId() + ", getClass()=" + getClass()
				+ ", getYear()=" + getYear() + ", getEngine()=" + getEngine() + ", getDispl()=" + getDispl()
				+ ", getCylinders()=" + getCylinders() + ", getForcedInduction()=" + getForcedInduction()
				+ ", getEngId()=" + getEngId() + ", getTransmission()=" + getTransmission() + ", getDrive()="
				+ getDrive() + ", getPrimaryFuel()=" + getPrimaryFuel() + ", getMpgCity()=" + getMpgCity()
				+ ", getMpgHighway()=" + getMpgHighway() + ", getMpgCombined()=" + getMpgCombined()
				+ ", getAlternateFuel()=" + getAlternateFuel() + ", getGuzzlerTax()=" + getGuzzlerTax()
				+ ", getTailpipeCO2Gpm()=" + getTailpipeCO2Gpm() + ", getMake()=" + getMake() + ", getModel()="
				+ getModel() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
