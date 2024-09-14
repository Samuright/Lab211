/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author THINH
 */
public class Brand {
    private String bId,bName;

    public Brand() {
    }

    public Brand(String bId, String bName) {
        this.bId = bId;
        this.bName = bName;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
    
    
    
}
