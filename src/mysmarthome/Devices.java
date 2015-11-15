/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysmarthome;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author ktams
 */
class Devices {

    static String  gsConfigDirectory = System.getProperty("user.home") + "/mySmartHome/";

    private boolean bLaunch = true;
    
    private String strName = null;
    private String strProtokoll = null;
    private String strGUIName = null;
    private String strRoom = null;
    private String strMedia = null;
    private String strUUID = null;
    
    public int nHumidity[] = new int[100];
    private float HumOffset = 0;
    public byte nTemperature[] = new byte[100];
    private byte maxTemp = -127;
    public boolean bMustAddTemp = false;
    private float TempOffset = 0;
    public int nAirPressure[] = new int[100];
    private int nDay = 0;

    private String strHumidity = null;
    private String strTemperature = null;
    private String strAirPressure = null;
    private String strSunrise = null;
    private String strSunset = null;
    
    private String strYear = null;
    private String strMonth = null;
    private String strDay = null;
    private String strHour = null;
    private String strMinute = null;
    private String strSecond = null;
    private String strWeekday = null;
    
    private String strIP = null;
    private String strLabel = null;
    private String strLabelColor = null;
    
    private int iState = 0;
    private int dimlevel = 0;
    private int dimMax = 0;
    private int dimMin = 0;
    private int iType = 0;
    
    private ImageIcon iOff = null;
    private ImageIcon iOn = null;
    private ImageIcon iSunRise = null;
    private ImageIcon iSunSet = null;
    private ImageIcon iTemperature = null;
    private ImageIcon iPressure = null;
    private ImageIcon iHumidity = null;
    
    private ArrayList<Component> cAction;
    private JComponent Button = null;
    
    private int[] arrID = new int[5];
    
    Devices(String ss) {
        this.strName = ss;
    }
    
    public void addTemp(byte newTemp)
    {
        try {
            try (FileOutputStream stream = new FileOutputStream(myHome.gsConfigDirectory + strName + ".temp")) {
                for(int i = 0; i < 99; i++)
                {
                    nTemperature[i] = nTemperature[i+1];
                    stream.write(nTemperature[i]);
                }
                nTemperature[99] = newTemp;
                stream.write(nTemperature[99]);
            }
        } catch (FileNotFoundException ex) {
            File f = new File(myHome.gsConfigDirectory + strName + ".temp");
            try {
                f.createNewFile();
                try (FileOutputStream stream = new FileOutputStream(myHome.gsConfigDirectory + strName + ".temp")) {
                    for(int i = 0; i < 100; i++)
                    {
                        stream.write(0);
                    }
                }
            } catch (IOException ex1) {
                Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getName()
    {
        return strName;
    }
    
    public String getLabel()
    {
        return strLabel;
    }
    
    public void setLabel(String l)
    {
        strLabel = l;
    }
    
    public String getLabelColor()
    {
        return strLabelColor;
    }
    
    public void setLabelColor(String l)
    {
        strLabelColor = l;
    }
    
    public String getHumidity()
    {
        return strHumidity;
    }
    
    public void setHumidity(String h)
    {
        strHumidity = h;
        if(h != null)
        {
            float f = Float.parseFloat(h);
            f += HumOffset;
            strHumidity = String.valueOf(f);
        }
    }
    
    public String getTemperature()
    {
        return strTemperature;
    }
    
    public void setTemperature(String h)
    {
        strTemperature = h;
        if(h != null)
        {
            float f = Float.parseFloat(h);
            f += TempOffset;
            strTemperature = String.valueOf(f);
            int i = strTemperature.indexOf('.');
            i = Integer.parseInt(strTemperature.substring(0, i));
            if(i > maxTemp)
                maxTemp = (byte)i;
        
            if(bLaunch)
            {
                bLaunch = false;
                try {
                    try (FileInputStream stream = new FileInputStream(myHome.gsConfigDirectory + strName + ".temp")) {
                        stream.read(nTemperature);   
                    }
                } catch (FileNotFoundException ex) {
                    File fT = new File(myHome.gsConfigDirectory + strName + ".temp");
                    try {
                        fT.createNewFile();
                        try (FileOutputStream stream = new FileOutputStream(myHome.gsConfigDirectory + strName + ".temp")) {
                            for(i = 0; i < 100; i++)
                            {
                                stream.write(0);
                            }
                            bMustAddTemp = true;
                        }
                    } catch (IOException ex1) {
                        Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                if(nTemperature[99] < maxTemp)
                {
                    nTemperature[99] = maxTemp;
                    try {
                        FileOutputStream stream = new FileOutputStream(myHome.gsConfigDirectory + strName + ".temp");
                        stream.write(nTemperature);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Devices.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
    public String getAirPressure()
    {
        return strAirPressure;
    }
    
    public void setAirPressure(String a)
    {
        strAirPressure = a;
    }
    
    public String getSunrise()
    {
        return strSunrise;
    }
    
    public void setSunrise(String s)
    {
        strSunrise = s;
    }
    
    public String getSunset()
    {
        return strSunset;
    }
    
    public void setSunset(String s)
    {
        strSunset = s;
    }
    
    public String getRoom()
    {
        return strRoom;
    }
    
    public void setRoom(String r)
    {
        strRoom = r;
    }
    
    public String getMedia()
    {
        return strMedia;
    }
    
    public void setMedia(String m)
    {
        strMedia = m;
    }
    
    public String getGUIName()
    {
        return strGUIName;
    }
    
    public void setGUIName(String gn)
    {
        strGUIName = gn;
    }
    
    public String getIP()
    {
        return strIP;
    }
    
    public void setIP(String ip)
    {
        strIP = ip;
    }
    
    public String getWeekday()
    {
        return strWeekday;
    }
    
    public void setWeekday(String w)
    {
        strWeekday = w;
    }
    
    public String getSecond()
    {
        if(strSecond.length() < 2)
            strSecond = "0" + strSecond;
        return strSecond;
    }
    
    public void setSecond(String s)
    {
        strSecond = s;
    }
    
    public String getMinute()
    {
        if(strMinute.length() < 2)
            strMinute = "0" + strMinute;
        return strMinute;
    }
    
    public void setMinute(String m)
    {
        strMinute = m;
    }
    
    public String getHour()
    {
        if(strHour.length() < 2)
            strHour = "0" + strHour;
        return strHour;
    }
    
    public void setHour(String h)
    {
        strHour = h;
    }
    
    public String getDay()
    {
        if(strDay.length() < 2)
            strDay = "0" + strDay;
        return strDay;
    }
    
    public void setDay(String d)
    {
        strDay = d;
    }
    
    public String getMonth()
    {
        if(strMonth.length() < 2)
            strMonth = "0" + strMonth;
        return strMonth;
    }
    
    public void setMonth(String m)
    {
        strMonth = m;
    }
    
    public String getYear()
    {
        return strYear;
    }
    
    public void setYear(String y)
    {
        strYear = y;
    }
    
    public int getState()
    {
        return iState;
    }
    
    public void setState(int state)
    {
        iState = state;
    }
    
    public int getDimlevel()
    {
        return dimlevel;
    }
    
    public void setDimlevel(int state)
    {
        dimlevel = state;
    }
    
    public int getDimMax()
    {
        return dimMax;
    }
    
    public void setDimMax(int state)
    {
        dimMax = state;
    }
    
    public int getDimMin()
    {
        return dimMin;
    }
    
    public void setDimMin(int state)
    {
        dimMin = state;
    }
    
    public int getType()
    {
        return iType;
    }
    
    public void setType(String t)
    {
        try {
            iType = Integer.parseInt(t);
        } catch (NumberFormatException numberFormatException) {
            iType = 1;
        }
    }
    
    public String getUUID()
    {
        return strUUID;
    }
    
    public void setUUID(String uuid)
    {
        strUUID = uuid;
    }
    
    public String getProtokoll()
    {
        return strProtokoll;
    }
    
    public void setProtokoll(String protocol)
    {
        strProtokoll = protocol;
    }
    public int[] getIDs()
    {
        return arrID;
    }
    
    public void setIDs(String ids)
    {
        String[] str = ids.split(",");       // split...
        for(int i = 0; i < str.length; i++)
        {
            if(i > 4)
                break;
            arrID[i] = i;
        }
    }

    void setAction(ArrayList<Component> ActionList) {
         cAction = ActionList;
   }

    ArrayList<Component> getAction() {
        return cAction;
    }

    void setIconOff(ImageIcon Ioff) {
        iOff = Ioff;
    }

    ImageIcon getIconOff( ) {
        return iOff;
    }

    ImageIcon getIconOn( ) {
        return iOn;
    }

    void setIconOn(ImageIcon Ion) {
        iOn = Ion;
    }

    ImageIcon getIconSunRise( ) {
        return iSunRise;
    }

    ImageIcon getIconSunSet( ) {
        return iSunSet;
    }

    void setIconSunRise(ImageIcon imageIcon) {
        iSunRise = imageIcon;
    }

    void setIconSunSet(ImageIcon imageIcon) {
        iSunSet = imageIcon;
    }

    ImageIcon getIconTemperature( ) {
        return iTemperature;
    }

    ImageIcon getIconHumidity( ) {
        return iHumidity;
    }

    ImageIcon getIconPressure( ) {
        return iPressure;
    }

    void setIconTemperature(ImageIcon imageIcon) {
        iTemperature = imageIcon;
    }

    void setIconHumidity(ImageIcon imageIcon) {
        iHumidity = imageIcon;
    }

    void setIconPressure(ImageIcon imageIcon) {
        iPressure = imageIcon;
    }

    void setSingleAction(JComponent bn) {
        Button = bn;
    }

    JComponent getSingleAction() {
        return Button;
    }

    void setnday(int Day) {
        nDay = Day;
        maxTemp = -127;
    }

    int getnDay() {
        return nDay;
    }

    void setTempOffset(String offset) {
        try {
            TempOffset = Float.parseFloat(offset);
            if(strTemperature != null)
            {
                float f = Float.parseFloat(strTemperature);
                f += TempOffset;
                strTemperature = String.valueOf(f);
            }
        } catch (NumberFormatException numberFormatException) {
            TempOffset = 0;
        }
    }

    byte getMaxTemperature() {
        return maxTemp;
    }

    void setHumOffset(String offset) {
        try {
            HumOffset = Float.parseFloat(offset);
            if(strHumidity != null)
            {
                float f = Float.parseFloat(strHumidity);
                f += HumOffset;
                strHumidity = String.valueOf(f);
            }
        } catch (NumberFormatException numberFormatException) {
            HumOffset = 0;
        }
    }

}
