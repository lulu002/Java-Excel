/*
 * Copyright 2015 www.hyberbin.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Email:hyberbin@qq.com
 */
package com.dituiba.excel;

/**
 * Created with IntelliJ IDEA.
 * User: Hyberbin
 * Date: 13-12-4
 * Time: 上午9:57
 */
public class ExcelVoErrorException extends Exception {
    private Class excelVo;
    private String message;

    public ExcelVoErrorException(Class excelVo){
        this.excelVo=excelVo;
    }
    public ExcelVoErrorException(Class excelVo,String message){
        this(excelVo);
        this.message = LanguageUtils.translate(message,excelVo.getName());
    }

    public void setMessage(String message) {
        this.message = LanguageUtils.translate(message,excelVo.getName());
    }

    public String getMessage() {
        return message;
    }
}
