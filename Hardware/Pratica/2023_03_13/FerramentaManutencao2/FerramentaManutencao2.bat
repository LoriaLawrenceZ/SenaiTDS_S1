@echo off
cls
:menu
cls
color 80

date /t

echo Computador: %computername%            Usuario: %username%

echo                     MENU TAREFAS
echo  =====================================================
echo * 1.  Esvaziar Lixeira                                *
echo * 2.  Fazer Backup                                    *
echo * 3.  Escanear Disco Local                            *
echo * 4.  Painel de Controle                              *
echo * 5.  Alterar Data                                    *
echo * 6.  Alterar Hora                                    *
echo * 7.  Versao Windows                                  *
echo * 8.  Configuracao de Conta de Usuario                *
echo * 9.  Central de Seguranca e Manutencao               *
echo * 10. Solucoes de Problemas do Windows                *
echo * 11. Gerenciamento do Computador                     *
echo * 12. Informacoes do Sistema                          *
echo * 13. Visualizacao de Eventos                         *
echo * 14. Listagem de Programas e Recursos                *
echo * 15. Propriedades de Internet                        *
echo * 16. Monitor de Recursos                             *
echo * 17. Relatorio de Performance                        *
echo * 18. Restaurar computador                            *
echo * 19. Ferramenta de Melhoria do Windows - Checagem    *
echo * 20. Ferramenta de Melhoria do Windows - Verificacao *
echo * 21. Ferramenta de Melhoria do Windows - Exclusao    *
echo * 22. Sair                                            *
echo  =====================================================

set /p opcao= Escolha uma opcao: 
echo ---------------------------------
if %opcao% equ 1 goto opcao1
if %opcao% equ 2 goto opcao2
if %opcao% equ 3 goto opcao3
if %opcao% equ 4 goto opcao4
if %opcao% equ 5 goto opcao5
if %opcao% equ 6 goto opcao6
if %opcao% equ 7 goto opcao7
if %opcao% equ 8 goto opcao8
if %opcao% equ 9 goto opcao9
if %opcao% equ 10 goto opcao10
if %opcao% equ 11 goto opcao11
if %opcao% equ 12 goto opcao12
if %opcao% equ 13 goto opcao13
if %opcao% equ 14 goto opcao14
if %opcao% equ 15 goto opcao15
if %opcao% equ 16 goto opcao16
if %opcao% equ 17 goto opcao17
if %opcao% equ 18 goto opcao18
if %opcao% equ 19 goto opcao19
if %opcao% equ 20 goto opcao20
if %opcao% equ 21 goto opcao21
if %opcao% equ 22 goto opcao22
if %opcao% equ 23 goto opcao23
if %opcao% GEQ 24 goto opcao24

:opcao1
cls
rd /S /Q C:\$Recicle.bin
echo  =============================
echo *      Lixeira Esvaziada      *
echo  =============================
pause
goto menu

:opcao2
cls
xcopy /T /C C:\Users\Aluno\Documents\*.*C:\Users\Aluno\Desktop
echo  ==========================
echo *     Backup Concluido     *
echo  ==========================
pause
goto menu

:opcao3
cls
echo  ===============================
echo *     Escaneamento de Disco     *
echo  ===============================
chkdsk C:
pause
goto menu

:opcao4
cls
echo  ====================================
echo *     Abrindo Painel de Controle     *
echo  ====================================
control.exe
pause
goto menu

:opcao5
cls
echo  ===============================
echo *          Mude a Data          *
echo  ===============================
date
pause
goto menu

:opcao6
cls
echo  ===============================
echo *           Mude a Hora         *
echo  ===============================
time
pause
goto menu

:opcao7
cls
echo  ==========================================
echo *     Versao do Windows sendo utilizada    *
echo  ==========================================
winver
goto menu

:opcao8
cls
echo  ============================================================
echo *     Abrindo Painel de Configuracao de Conta de Usuario     *
echo  ============================================================
UserAccountControlSettings
pause
goto menu

:opcao9
cls
echo  =========================================================================
echo *     Abrindo Central de Seguranca e Manutencao no Painel de Controle     *
echo  =========================================================================
wscui.cpl
pause
goto menu

:opcao10
cls
echo  ============================================================================
echo *     Abrindo Painel de Configuracoes da Solucao de Problemas do Windows     *
echo  ============================================================================
control.exe /name Microsoft.Troubleshooting
pause
goto menu

:opcao 11
cls
echo  ==============================================
echo *     Abrindo Gerenciamento do Computador     *
echo  ==============================================
compmgmt.msc
pause
goto menu

:opcao 12
cls
echo  =========================================
echo *     Exibindo Informacoes do Sistema     *
echo  =========================================
msinfo32.exe
pause
goto menu

:opcao13
cls
echo  ===================================================
echo *     Abrindo Painel de Visualizacao de Eventos     *
echo  ===================================================
eventvwr
pause
goto menu

:opcao14
cls
echo  ====================================================================
echo *     Listando Programas e Recursos dentro do Painel de Controle     *
echo  ====================================================================
appwiz.cpl
pause
goto menu

:opcao15
cls
echo  ===========================================
echo *     Exibindo Propriedades da Internet     *
echo  ===========================================
inetcpl.cpl
pause
goto menu

:opcao16
cls
echo  =====================================
echo *     Abrindo Monitor de Recursos     *
echo  =====================================
resmon.exe
pause
goto menu

:opcao17
cls
echo  ==================================
echo *     Relatório de Performance     *
echo  ==================================
perfmon /report
pause
goto menu

:opcao18
cls
echo  ====================================================================
echo *     Restaurar Computador (A partir do ultimo Ponto Programado)     *
echo  ====================================================================
rstrui.exe
pause
goto menu

:opcao19
cls
echo  ======================================================
echo *     Ferramenta de Melhoria do Windows - Checagem     *
echo  ======================================================
echo    ====================================================
echo !!!     ESTA ACAO NECESSITA REINICIAR O COMPUTADOR     !!!
echo    ====================================================
set /p sOUn= Deseja continuar? (1-sim / 2-nao)
if %sOUn% equ 1 goto opcao19.5
if %sOUn% equ 2 goto menu

:opcao19.5
chkdsk /r
pause
shutdown -r -t 0

:opcao20
cls
echo  =========================================================
echo *     Ferramenta de Melhoria do Windows - Verificacao     *
echo  =========================================================
sfc /scannow
pause
goto menu

:opcao21
cls
echo  ======================================================
echo *     Ferramenta de Melhoria do Windows - Exclusao     *
echo  ======================================================
DISM /Online /Cleanup-image /Restorehealth
pause
goto menu

:opcao22
cls
exit

:opcao23
cls
echo  ================================================
echo *    Opção Invalida! Escolha outra opção do menu *
echo  ================================================
pause
goto menu