package model;

import org.json.JSONObject;

public class Train {
	private JSONObject json;
	private int number;
	private int traintype;
	private String fullId;
	private String departureStation;
	private String terminusStation;
	private Stop stop;
	private boolean cancelled;
	private Time time;
	private String Jid;
	private String Cid;

	public Train(JSONObject json) {
		if (!json.get("Number").equals(null)) {
			this.number = json.getInt("Number");
		} else
			this.number = 0;
		this.traintype = json.getInt("TrainType");
		this.fullId = json.getString("FullId");
		this.departureStation = json.getString("DepartureStation");
		this.terminusStation = json.getString("TerminusStation");
		this.stop = new Stop(json.getJSONObject("Stops"));
		this.cancelled = json.getBoolean("Cancelled");
		this.time = new Time(json.getJSONObject("Time"));
		if (!json.get("Jid").equals(null)) {
			this.Jid = (String)json.get("Jid");
		} else
			this.Jid = "";
		if (!json.get("Cid").equals(null)) {
			this.Cid = (String)json.get("Cid");
		} else
			this.Cid = "";
	}
	
	public Train(String trein) {
		try {
			json = new JSONObject(Routeberekening.readUrl("https://traintracks.online/api/Train/" + trein));
			if (!json.get("Number").equals(null)) {
				this.number = json.getInt("Number");
			} else
				this.number = 0;
			this.traintype = json.getInt("TrainType");
			this.fullId = json.getString("FullId");
			this.departureStation = json.getString("DepartureStation");
			this.terminusStation = json.getString("TerminusStation");
			this.stop = new Stop(json.getJSONObject("Stops"));
			this.cancelled = json.getBoolean("Cancelled");
			this.time = new Time(json.getJSONObject("Time"));
			if (!json.get("Jid").equals(null)) {
				this.Jid = (String)json.get("Jid");
			} else
				this.Jid = "";
			if (!json.get("Cid").equals(null)) {
				this.Cid = (String)json.get("Cid");
			} else
				this.Cid = "";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTraintype() {
		return traintype;
	}

	public void setTraintype(int traintype) {
		this.traintype = traintype;
	}

	public String getFullId() {
		return fullId;
	}

	public void setFullId(String fullId) {
		this.fullId = fullId;
	}

	public String getDepartureStation() {
		return departureStation;
	}

	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}

	public String getTerminusStation() {
		return terminusStation;
	}

	public void setTerminusStation(String terminusStation) {
		this.terminusStation = terminusStation;
	}

	public Stop getStop() {
		return stop;
	}

	public void setStop(Stop stop) {
		this.stop = stop;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getJid() {
		return Jid;
	}

	public void setJid(String jid) {
		Jid = jid;
	}

	public String getCid() {
		return Cid;
	}

	public void setCid(String cid) {
		Cid = cid;
	}
}
