package com.doc.model;

public class Doctor {
		private int docid;
		private String profile;
		private String name;
		private String mno;
		private String address;
		private String clinicname;
		private String service;
		private String spec;
		public Doctor() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Doctor(int docid, String profile, String name, String mno, String address, String clinicname,
				String service, String spec) {
			super();
			this.docid = docid;
			this.profile = profile;
			this.name = name;
			this.mno = mno;
			this.address = address;
			this.clinicname = clinicname;
			this.service = service;
			this.spec = spec;
		}
		public int getDocid() {
			return docid;
		}
		public void setDocid(int docid) {
			this.docid = docid;
		}
		public String getProfile() {
			return profile;
		}
		public void setProfile(String profile) {
			this.profile = profile;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMno() {
			return mno;
		}
		public void setMno(String mno) {
			this.mno = mno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getClinicname() {
			return clinicname;
		}
		public void setClinicname(String clinicname) {
			this.clinicname = clinicname;
		}
		public String getService() {
			return service;
		}
		public void setService(String service) {
			this.service = service;
		}
		public String getSpec() {
			return spec;
		}
		public void setSpec(String spec) {
			this.spec = spec;
		}
		@Override
		public String toString() {
			return "Doctor [docid=" + docid + ", profile=" + profile + ", name=" + name + ", mno=" + mno + ", address="
					+ address + ", clinicname=" + clinicname + ", service=" + service + ", spec=" + spec + "]";
		}
		
}
