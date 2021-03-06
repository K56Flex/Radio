package com.example.radio.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Station implements Parcelable{

	private int id;
	private String name;
	private String country;
	private String url;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(id);
		dest.writeString(name);
		dest.writeString(country);
		dest.writeString(url);
		
	}
	
	public static final Parcelable.Creator<Station> CREATOR = new Parcelable.Creator<Station>() {
        // ������������� ������ �� Parcel
        public Station createFromParcel(Parcel in) {
            return new Station(in);
        }

        public Station[] newArray(int size) {
            return new Station[size];
        }
    };
	
    private Station(Parcel parcel){
    	id = parcel.readInt();
        name = parcel.readString();
        country = parcel.readString();
        url = parcel.readString();
    }
	public Station() {
		// TODO Auto-generated constructor stub
	}
	
}
