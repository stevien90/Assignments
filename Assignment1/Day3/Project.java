package Day3;

public class Project {
	
	private int projectid;
	private String projectname;
	private String clientname;
	private String sidekick;
	
	public Project(int projectid, String projectname, String clientname) {
		this.projectid = projectid;
		this.projectname = projectname;
		this.clientname = clientname;
	}
	
	

	public Project(int projectid, String projectname, String clientname, String sidekick) {
		this(projectid,projectname,clientname);
		this.sidekick = sidekick;
	}



	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", projectname=" + projectname + ", clientname=" + clientname
				+ ", sidekick=" + sidekick + "]";
	}
	
	
}

	
