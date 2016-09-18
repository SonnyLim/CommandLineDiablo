package cosc344.models;

/**
 * Created by albertgao on 11/09/16.
 */
public class Quest {
    private String name;
    private int mandatory;
    private String type;
    private String difficulty;
    
    /**
     * Default constructor
     */
    public Quest() {
    }
    
    /**
     * 4-arg Quest constructor
     * @param String name of the quest
     * @param int mandatory check if it is mandatory or not
     * @param String type of quest
     * @param String difficulty of the quest
     */
    public Quest(String name, int mandatory, String type, String difficulty) {
        this.name = name;
        this.mandatory = mandatory;
        this.type = type;
        this.difficulty = difficulty;
    }
    
    /**
     * Gets quest name
     * @return String name of the quest
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets quest name
     * @param String name - the name that the quest will be set to
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets quest mandatory value
     * @return int mandatory - the mandatory value of the quest
     */
    public int getMandatory() {
        return mandatory;
    }
    
    /**
     * Sets quest mandatory value
     * @param int mandatory - the value that the quest's mandatory value will be set to
     */
    public void setMandatory(int mandatory) {
        this.mandatory = mandatory;
    }
    
    /**
     * Gets quest type
     * @return String type of the quest
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets quest type
     * @param String type that the quest will be set to
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Gets quest difficulty
     * @return String difficulty of the quest
     */
    public String getDifficulty() {
        return difficulty;
    }
    
    /**
     * Sets quest difficulty
     * @param String difficulty that the quest will be set as
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
    /**
     * Override toString
     * @return String representation of the Quest object with variables name,mandatoy,type,difficulty.
     */
    @Override
    public String toString() {
        return "Quest{" +
                "name='" + name + '\'' +
                ", mandatory=" + mandatory +
                ", type='" + type + '\'' +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
