package it.finsoft.Thorntail.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "U7B2_OWN.T_U7ES0_RUN_PROCEDURE")
@NamedQueries({
	@NamedQuery(name = "estrattori.selectAll", query = "SELECT e FROM Estrattore e WHERE e.flgDatastage ='1'"),
	@NamedQuery(name = "estrattori.abort", query = "UPDATE Estrattore e SET e.status = 'ABORTED' WHERE e.status = :initial"),
	@NamedQuery(name = "estrattori.runProcedure", query = "UPDATE Estrattore e SET e.status = 'INITIAL' WHERE e.idProcedura in :lista")
})
public class Estrattore {

	@NotNull
	@Column(name = "COD_PRIORITA")
	private Integer codPriorita; // COD_PRIORITA NUMBER Yes 1

	@NotNull
	@Id
	@Column(name = "IDPROCEDURA")
	private Integer idProcedura; // IDPROCEDURA NUMBER(38,0) Yes 2

	@NotNull
	@Column(name = "COD_PROCEDURA")
	private String codProcedura; // COD_PROCEDURA VARCHAR2(500 BYTE) Yes 3

	@Column(name = "DATA_INIZIO")
	private Date dataInizio; // DATA_INIZIO DATE Yes 4

	@Column(name = "DATA_FINE")
	private Date dataFine; // DATA_FINE DATE Yes 5

	@Column(name = "DURATA_MEDIA")
	private Integer durataMedia; // DURATA_MEDIA NUMBER Yes 6

	@Column(name = "DATA_RIF")
	private Date dataRif; // DATA_RIF DATE Yes 7

	@Column(name = "FLG_ACTIVE")
	private Integer flgActive; // FLG_ACTIVE NUMBER Yes 8

	@Column(name = "STATUS")
	private String status; // STATUS VARCHAR2(50 BYTE) Yes 9

	@Column(name = "DESC_PROCEDURE")
	private String descProcedure; // DESC_PROCEDURE VARCHAR2(4000 BYTE) Yes 10

	@Column(name = "COD_AGGREGAZIONE")
	private String codAggregazione; // COD_AGGREGAZIONE VARCHAR2(4000 BYTE) Yes 11

	@Column(name = "FLG_VISIBLE")
	private Integer flgVisible; // FLG_VISIBLE NUMBER Yes 12

	@Column(name = "COD_MODULO")
	private String codModulo; // COD_MODULO VARCHAR2(4000 BYTE) Yes 13

	@Column(name = "NUM_SEGN")
	private Integer numSegn; // NUM_SEGN NUMBER Yes 14

	@Column(name = "FLG_SIMULAZIONE")
	private String flgSimulazione; // FLG_SIMULAZIONE VARCHAR2(1 BYTE) Yes 15

	@Column(name = "FLG_VAL")
	private Integer flgVal; // FLG_VAL NUMBER Yes 16

	@Column(name = "FLG_LOG")
	private String flgLog; // FLG_LOG VARCHAR2(1 BYTE) Yes 17

	@Column(name = "TBL")
	private String tbl;// TBL VARCHAR2(1000 BYTE) Yes 18

	@Column(name = "APP")
	private String app; // APP VARCHAR2(10 BYTE) Yes 19

	@Column(name = "USERID")
	private String userId; // USERID VARCHAR2(7 BYTE) Yes 20

	@Column(name = "COD_VISUAL_OPZIONI")
	private Integer codVisualOpzioni; // COD_VISUAL_OPZIONI NUMBER(38,0) Yes 21

	@Column(name = "ID_ELABORAZIONE")
	private Integer idElaborazione;// ID_ELABORAZIONE NUMBER(38,0) Yes 22 identificativo delle elaborazioni Sas

	@Column(name = "FLG_DATASTAGE")
	private String flgDatastage; // FLG_DATASTAGE CHAR(1 BYTE) Yes '0' 23

	@Column(name = "DATA_TWSADD")
	private Date dataTWSAdd; // DATA_TWSADD DATE Yes 24

	@Column(name = "MUST_WAIT")
	private String mustWait; // MUST_WAIT CHAR(1 BYTE) Yes '1' 25

	public Integer getCodPriorita() {
		return codPriorita;
	}

	public void setCodPriorita(Integer codPriorita) {
		this.codPriorita = codPriorita;
	}

	public Integer getIdProcedura() {
		return idProcedura;
	}

	public void setIdProcedura(Integer idProcedura) {
		this.idProcedura = idProcedura;
	}

	public String getCodProcedura() {
		return codProcedura;
	}

	public void setCodProcedura(String codProcedura) {
		this.codProcedura = codProcedura;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Integer getDurataMedia() {
		return durataMedia;
	}

	public void setDurataMedia(Integer durataMedia) {
		this.durataMedia = durataMedia;
	}

	public Date getDataRif() {
		return dataRif;
	}

	public void setDataRif(Date dataRif) {
		this.dataRif = dataRif;
	}

	public Integer getFlgActive() {
		return flgActive;
	}

	public void setFlgActive(Integer flgActive) {
		this.flgActive = flgActive;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescProcedure() {
		return descProcedure;
	}

	public void setDescProcedure(String descProcedure) {
		this.descProcedure = descProcedure;
	}

	public String getCodAggregazione() {
		return codAggregazione;
	}

	public void setCodAggregazione(String codAggregazione) {
		this.codAggregazione = codAggregazione;
	}

	public Integer getFlgVisible() {
		return flgVisible;
	}

	public void setFlgVisible(Integer flgVisible) {
		this.flgVisible = flgVisible;
	}

	public String getCodModulo() {
		return codModulo;
	}

	public void setCodModulo(String codModulo) {
		this.codModulo = codModulo;
	}

	public Integer getNumSegn() {
		return numSegn;
	}

	public void setNumSegn(Integer numSegn) {
		this.numSegn = numSegn;
	}

	public String getFlgSimulazione() {
		return flgSimulazione;
	}

	public void setFlgSimulazione(String flgSimulazione) {
		this.flgSimulazione = flgSimulazione;
	}

	public Integer getFlgVal() {
		return flgVal;
	}

	public void setFlgVal(Integer flgVal) {
		this.flgVal = flgVal;
	}

	public String getFlgLog() {
		return flgLog;
	}

	public void setFlgLog(String flgLog) {
		this.flgLog = flgLog;
	}

	public String getTbl() {
		return tbl;
	}

	public void setTbl(String tbl) {
		this.tbl = tbl;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCodVisualOpzioni() {
		return codVisualOpzioni;
	}

	public void setCodVisualOpzioni(Integer codVisualOpzioni) {
		this.codVisualOpzioni = codVisualOpzioni;
	}

	public Integer getIdElaborazione() {
		return idElaborazione;
	}

	public void setIdElaborazione(Integer idElaborazione) {
		this.idElaborazione = idElaborazione;
	}

	public String getFlgDatastage() {
		return flgDatastage;
	}

	public void setFlgDatastage(String flgDatastage) {
		this.flgDatastage = flgDatastage;
	}

	public Date getDataTWSAdd() {
		return dataTWSAdd;
	}

	public void setDataTWSAdd(Date dataTWSAdd) {
		this.dataTWSAdd = dataTWSAdd;
	}

	public String getMustWait() {
		return mustWait;
	}

	public void setMustWait(String mustWait) {
		this.mustWait = mustWait;
	}

}
