package com.taller.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Persona")
public class User implements Serializable {
	private static final long serialVersionUID = -7986593455542406220L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iD_PERSONA")
	private Number id;
	@Column(name = "CORREO")
	private String correo;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO")
	private String apellido;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "TELEFONO")
	private Number telefono;
	@Column(name = "CELULAR")
	private Number celular;

	public User(Number id, String correo, String password, String nombre, String apellido, String direccion,
			Number telefono, Number celular) {
		super();
		this.id = id;
		this.correo = correo;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.celular = celular;

	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Number getTelefono() {
		return telefono;
	}

	public void setTelefono(Number telefono) {
		this.telefono = telefono;
	}

	public Number getCelular() {
		return celular;
	}

	public void setCelular(Number celular) {
		this.celular = celular;
	}

}
