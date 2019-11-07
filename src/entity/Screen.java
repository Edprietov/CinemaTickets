/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author NikcQ
 */
public class Screen {

//seat block order is GA - VIP - 4DX(if availlable)
private boolean blockGA [][]; //matrix that contains the availlability of general seats. Default is FALSE
private boolean blockVIP[][]; //matrix that contains the availlability of VIP seats. Default is FALSE
private boolean block4DX[][]; //matrix that contains the availlability of 4DX seats. Default is FALSE
private boolean is3D;         //Specifies if the movie is projected in 3D or not

    public Screen(boolean[][] blockGA, boolean[][] blockVIP, boolean[][] block4DX, boolean is3D) {
        this.blockGA = blockGA;
        this.blockVIP = blockVIP;
        this.block4DX = block4DX;
        this.is3D = is3D;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean[][] getBlockGA() {
        return blockGA;
    }

    public void setBlockGA(boolean[][] blockGA) {
        this.blockGA = blockGA;
    }

    public boolean[][] getBlockVIP() {
        return blockVIP;
    }

    public void setBlockVIP(boolean[][] blockVIP) {
        this.blockVIP = blockVIP;
    }

    public boolean[][] getBlock4DX() {
        return block4DX;
    }

    public void setBlock4DX(boolean[][] block4DX) {
        this.block4DX = block4DX;
    }





    
}
