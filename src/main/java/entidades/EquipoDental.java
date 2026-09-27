package entidades;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_equipo_dental")
public class EquipoDental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_equipo")
	private Integer nroEquipo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "costo")
	private BigDecimal costo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_adquisicion")
	private Date fechaAdquisicion;

	@Column(name = "estado")
	private String estado;

	@ManyToOne
	@JoinColumn(name = "id_dentista")
	private Dentista dentista;

	public Integer getNroEquipo() {
		return nroEquipo;
	}

	public void setNroEquipo(Integer nroEquipo) {
		this.nroEquipo = nroEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Dentista getDentista() {
		return dentista;
	}

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}
}
