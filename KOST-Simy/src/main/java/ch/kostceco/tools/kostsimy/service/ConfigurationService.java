/* == KOST-Simy =================================================================================
 * The KOST-Simy application is used for Compare TIFF, JPEG and PDF/A-Files. Copyright (C) 2015
 * Claire R�thlisberger (KOST-CECO)
 * -----------------------------------------------------------------------------------------------
 * KOST-Simy is a development of the KOST-CECO. All rights rest with the KOST-CECO. This application
 * is free software: you can redistribute it and/or modify it under the terms of the GNU General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This application is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the follow GNU General Public License for more details. You should
 * have received a copy of the GNU General Public License along with this program; if not, write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA or
 * see <http://www.gnu.org/licenses/>.
 * ============================================================================================== */

package ch.kostceco.tools.kostsimy.service;

/** Service Interface f�r die Konfigurationsdatei.
 * 
 * @author Rc Claire R�thlisberger, KOST-CECO */
public interface ConfigurationService extends Service
{
	/** Gibt den Pfad des Arbeitsverzeichnisses zur�ck. Dieses Verzeichnis wird z.B. zum Entpacken des
	 * .zip-Files verwendet.
	 * 
	 * @return Pfad des Arbeitsverzeichnisses */
	String getPathToWorkDir();

	/** Gibt den Pfad des Logverzeichnisses zur�ck.
	 * 
	 * @return Pfad des Logverzeichnisses */
	String getPathToLogfile();

	/** Gibt die prozentuale Stichprobe zur�ck.
	 * 
	 * @return Stichprobe in Prozent */
	String getRandomTest();

	/** Gibt den Pfad des IMGCMP-Verzeichnisses zur�ck.
	 * 
	 * @return Pfad des IMGCMP-Verzeichnisses */
	String getPathToImgcmpExe();

	/** Lizenz-Schl�ssel zu ImageCompareCommandLine (IMGCMP)
	 * 
	 * @return Lizenz-Schl�ssel */
	String imgcmpLicenseKey();

	/** Toleranz beim Bildervergleich
	 * small = 5% diff pro Pixel
	 * medium = 10% diff pro Pixel
	 * large = 20% diff pro Pixel
	 * 
	 * @return toleranz-text */
	String imgcmpTolerance();

}
