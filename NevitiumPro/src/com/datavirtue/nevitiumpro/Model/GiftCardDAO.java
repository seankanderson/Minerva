/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.datavirtue.nevitiumpro.Model;

import com.datavirtue.nevitiumpro.Util.Tools;
import com.datavirtue.nevitiumpro.Legacy.datavirtue.DbEngine;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Data Virtue
 */
public class GiftCardDAO {

    public GiftCardDAO(DbEngine db){

        this.db = db;

    }

    public boolean loadAccount(String acct){
        
        ArrayList al = db.search("card", 1, acct, false);
        if (al != null && al.size() >= 1){
            al.trimToSize();
            if (al.size() > 1){
                javax.swing.JOptionPane.showMessageDialog(null, 
                        "It seems as though there is more than one record using that account number.");
                return false;
            }
            
            int k = (Integer)al.get(0);
            data = db.getRecord("card", k);
            populated = true;
            return true;
        }
        return false;
    }

    public float getBalance(){
        if (!populated) return 0.00f;
        return Tools.round((Float)data[3]);
    }

    public float useFunds(float amount){
/* returns amount used on the card */
        float balance = this.getBalance();

        if (amount > balance) {
            data[3] = 0.00f;
            data[4] = new Date().getTime();
            db.saveRecord("card", data, false);
            return balance;
        }

        if (amount <= balance){
            data[3] = (balance - amount);
            data[4] = new Date().getTime();
        }
        db.saveRecord("card", data, false);
        return amount;

    }

    private boolean populated = false;
    private Object[] data;
    private DbEngine db;
}
