package org.asoap;

import java.io.Serializable;
import java.util.Date;

import org.asoap.annotation.SOAPObject;
import org.asoap.annotation.SOAPProperty;

@SOAPObject
public class DummyObject implements Serializable {

	private static final long serialVersionUID = 841070159684621033L;

	@SOAPProperty(name = "HorizontalFormation")
	private int horizontalFormation;

	@SOAPProperty(name = "VerticalFormation")
	private int verticalFormation;

	@SOAPProperty(name = "ResolutionHeight")
	private int resolutionHeight;

	@SOAPProperty(name = "ResolutionWidth")
	private int resolutionWidth;

	@SOAPProperty(name = "BirthDate")
	private Date birthDate;

	public int getHorizontalFormation() {
		return horizontalFormation;
	}

	public void setHorizontalFormation(int horizontalFormation) {
		this.horizontalFormation = horizontalFormation;
	}

	public int getVerticalFormation() {
		return verticalFormation;
	}

	public void setVerticalFormation(int verticalFormation) {
		this.verticalFormation = verticalFormation;
	}

	public int getResolutionHeight() {
		return resolutionHeight;
	}

	public void setResolutionHeight(int resolutionHeight) {
		this.resolutionHeight = resolutionHeight;
	}

	public int getResolutionWidth() {
		return resolutionWidth;
	}

	public void setResolutionWidth(int resolutionWidth) {
		this.resolutionWidth = resolutionWidth;
	}

	public int getWallResolutionWidth() {
		return resolutionWidth * horizontalFormation;
	}

	public int getWallResolutionHeight() {
		return resolutionHeight * verticalFormation;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
