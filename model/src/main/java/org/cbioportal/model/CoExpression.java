package org.cbioportal.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

public class CoExpression implements Serializable {

    @NotNull
    private Integer entrezGeneId;
    @NotNull
    private String hugoGeneSymbol;
    @NotNull
    private String cytoband;
    @NotNull
    private BigDecimal pearsonsCorrelation;
    @NotNull
    private BigDecimal spearmansCorrelation;

    public Integer getEntrezGeneId() {
        return entrezGeneId;
    }

    public void setEntrezGeneId(Integer entrezGeneId) {
        this.entrezGeneId = entrezGeneId;
    }

    public String getHugoGeneSymbol() {
        return hugoGeneSymbol;
    }

    public void setHugoGeneSymbol(String hugoGeneSymbol) {
        this.hugoGeneSymbol = hugoGeneSymbol;
    }

    public String getCytoband() {
        return cytoband;
    }

    public void setCytoband(String cytoband) {
        this.cytoband = cytoband;
    }

    public BigDecimal getPearsonsCorrelation() {
        return pearsonsCorrelation;
    }

    public void setPearsonsCorrelation(BigDecimal pearsonsCorrelation) {
        this.pearsonsCorrelation = pearsonsCorrelation;
    }

    public BigDecimal getSpearmansCorrelation() {
        return spearmansCorrelation;
    }

    public void setSpearmansCorrelation(BigDecimal spearmansCorrelation) {
        this.spearmansCorrelation = spearmansCorrelation;
    }
}
