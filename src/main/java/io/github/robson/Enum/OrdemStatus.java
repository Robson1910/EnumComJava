package io.github.robson.Enum;

public enum OrdemStatus {

    /**
     * Enum variable
     */
    PROCESSANDO_PAGAMENTO(1),
    PAGAMENTO_CONFIRMADO(2),
    PAGAMENTO_CANCELADO(3);

    /**
     *  Enum variable code
     */
    private int code;

    /**
     * @param code
     */
    private OrdemStatus(int code){
        this.code = code;
    }

    /**
     * @return code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code
     * @return value code
     */
    public static OrdemStatus valueOf(int code){
        for(OrdemStatus value : OrdemStatus.values()){
            if(code == value.getCode()){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrdemStatus!");
    }
}
