package pro8;

public class Module {
    private final int moduleId;
    private final String moduleCode;
    private final String module;
    private final int professorIds[];
    
    public Module(int moduleId, String moduleCode, String module, int professorIds[]){
        this.moduleId = moduleId;
        this.moduleCode = moduleCode;
        this.module = module;
        this.professorIds = professorIds;
    }
    
    public int getModuleId(){
        return this.moduleId;
    }
    
    public String getModuleCode(){
        return this.moduleCode;
    }

    public String getModuleName(){
        return this.module;
    }

    public int getRandomProfessorId(){
        int professorId = professorIds[(int) (professorIds.length * Math.random())];
        return professorId;
    }
}
