/*******************************************************************************
 * oltpbenchmark.com
 *  
 *  Project Info:  http://oltpbenchmark.com
 *  Project Members:    Carlo Curino <carlo.curino@gmail.com>
 *              Evan Jones <ej@evanjones.ca>
 *              DIFALLAH Djellel Eddine <djelleleddine.difallah@unifr.ch>
 *              Andy Pavlo <pavlo@cs.brown.edu>
 *              CUDRE-MAUROUX Philippe <philippe.cudre-mauroux@unifr.ch>  
 *                  Yang Zhang <yaaang@gmail.com> 
 * 
 *  This library is free software; you can redistribute it and/or modify it under the terms
 *  of the GNU General Public License as published by the Free Software Foundation;
 *  either version 3.0 of the License, or (at your option) any later version.
 * 
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 ******************************************************************************/
package com.oltpbenchmark.catalog;

/**
 * 
 * @author pavlo
 */
public class Column implements Cloneable {

    private final String name;
    private final int type;
    private final String typename;
    private final Integer size;
    
    private boolean nullable = false;
    private boolean autoincrement = false;
    private boolean signed = false;
    
    public Column(String name, int type, String typename, Integer size) {
        this.name = name;
        this.type = type;
        this.typename = typename;
        this.size = size;
    }
    
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @return the typename
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @return the size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @return the nullable
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * @return the autoincrement
     */
    public boolean isAutoincrement() {
        return autoincrement;
    }

    /**
     * @return the signed
     */
    public boolean isSigned() {
        return signed;
    }

    /**
     * @param nullable the nullable to set
     */
    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    /**
     * @param autoincrement the autoincrement to set
     */
    public void setAutoincrement(boolean autoincrement) {
        this.autoincrement = autoincrement;
    }

    /**
     * @param signed the signed to set
     */
    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    
    
}