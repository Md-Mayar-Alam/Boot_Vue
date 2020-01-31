<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ attribute name="currentpagetype"  required="false" type="java.lang.String"  description="Page Type - possible values plp, ptlp, pdp, job types" %>

<script type="text/javascript" src="${sharedResourcePath}/js/jquery.autocomplete.js?v=${buildNumber}"></script>
<script>$fnautocomplete = $.fn.devbridgeAutocomplete; var vehicleSelectorPresent=true;</script>
<script>
    var preSelectedVehicle = {};
    <c:set var="ymmpresent" value="false"/>
<c:forEach items="${selectedType}" var="entry">
preSelectedVehicle.types = {"endecaid":"${entry.key}","value":"${entry.value}"};
<c:set var="ymmpresent" value="true"/>
<c:set var="ymmType" value="${entry.value}"/>

</c:forEach>
<c:forEach items="${selectedYear}" var="entry">
preSelectedVehicle.years = {"endecaid":"${entry.key}","value":"${entry.value}"};
<c:set var="ymmpresent" value="true"/>
<c:set var="ymmYear" value="${entry.value}"/>

</c:forEach>
<c:forEach items="${selectedMake}" var="entry">
preSelectedVehicle.makes = {"endecaid":"${entry.key}","value":"${entry.value}"};
<c:set var="ymmpresent" value="true"/>
<c:set var="ymmMake" value="${entry.value}"/>

</c:forEach>
<c:forEach items="${selectedModel}" var="entry">
preSelectedVehicle.models = {"endecaid":"${entry.key}","value":"${entry.value}"};
<c:set var="ymmpresent" value="true"/>
<c:set var="ymmModel" value="${entry.value}"/>
</c:forEach>
</script>

<c:set var="displayVehicleSelectModal">style="display:none"</c:set>style="display:block"
<c:set var="displaySavedVehicleModal">style="display:none"</c:set>style="display:block"
<c:set var="displayNewVehicleLink">style="display:none"</c:set>style="display:block"

Algorithim at  http://auapgpdcctapp01:8080/display/NOLH/Search+2.0+-+VSM+Flow

<c:set var="vsmHeaderselectNewVehicleLink">
    <span class="nol-slide-link link-blue" rel="nol-slide-link" data-targetselector="#veh-select-modal" data-clearfields="true"> 
        <spring:message code="text.search.ptlp.select.new.vehicle" text="Select New Vehicle" />
    <span class="icon-napa-arrow-down"></span></span>   
</c:set>
<c:set var="vsmHeaderselectAVehicleLink">
    <span class="nol-slide-link link-blue" rel="nol-slide-link" data-targetselector="#veh-select-modal" data-clearfields="true"> 
        <spring:message code="text.search.ptlp.select.new.vehicle" text="Select New Vehicle" />
    <span class="icon-napa-arrow-down"></span></span>   
</c:set>
<c:set var="vsmHeaderCompleteVehicleLink">
    <span class="nol-slide-link link-blue" rel="nol-slide-link" data-targetselector="#veh-select-modal">
        <spring:message code="text.search.ptlp.complete.vehicle" text="Complete vehicle" />
    <span class="icon-napa-arrow-down"></span></span> 
</c:set>


<c:set var="suggestedVehicles" value="${savedVehicles}"></c:set>

        <c:choose>
            <c:when test="${not empty ymmYear and not empty ymmMake and not empty ymmModel}">
                <c:choose>
                    <c:when test="${vehicleApplied}">
                        <c:set var="displayVehicleSelectModal">style="display:none"</c:set>
                    </c:when>
                    <c:otherwise>
                        <c:set var="displayVehicleSelectModal">style="display:block"</c:set>
                    </c:otherwise>
                </c:choose>

                <c:set var="displaySavedVehicleModal">style="display:none"</c:set>
                <c:set var="vehSelectHeader">
                    <span Class="veh-selected text-bold">${vehicleDefault}</span>
                    ${vsmHeaderselectNewVehicleLink}
                </c:set>
            </c:when>
            <c:otherwise>
                <c:choose>
                    <c:when test="${not empty ymmYear or not empty ymmMake or not empty ymmModel}">
                        if (matchedSuggestion.count > 0 || inbentaSuggestion> 0) {
                        <c:choose>
                            <c:when test="${fn:length(matchedSuggestion) gt 0 or fn:length(inbentaSuggestion) gt 0}">
                                collapse vsm
                                <c:set var="displayVehicleSelectModal">style="display:none"</c:set>
                                <c:set var="displaySavedVehicleModal">style="display:block"</c:set>
                                <c:set var="suggestedVehicles" value="${matchedSuggestion}"></c:set>
                               
                            </c:when>
                            <c:otherwise>
                                <c:set var="displayVehicleSelectModal">style="display:block"</c:set>
                                <c:set var="displaySavedVehicleModal">style="display:none"</c:set>
                            </c:otherwise>
                        </c:choose>                        
                        <c:set var="vehSelectHeader">
                        <span class="veh-selected"><spring:message code="text.search.ptlp.for.best.results" text="For best results,complete your " /><b>${ymmYear} ${ymmMake} ${ymmModel}</b></span>
                            ${vsmHeaderCompleteVehicleLink}
                        </c:set>
                        <c:set var="displayNewVehicleLink">style="display:block"</c:set>              
                    </c:when>
                    <c:otherwise>
                        <c:choose>
                            <c:when test="${fn:length(suggestedVehicles) gt 0}">
                                <c:set var="displayVehicleSelectModal">style="display:none"</c:set>
                                <c:set var="displaySavedVehicleModal">style="display:block"</c:set>
 
                            </c:when>
                            <c:otherwise>
                                <c:set var="displayVehicleSelectModal">style="display:block"</c:set>
                                <c:set var="displaySavedVehicleModal">style="display:none"</c:set>

                            </c:otherwise>
                        </c:choose>
                        <c:set var="vehSelectHeader">
                            <c:choose>
                                <c:when test="${vehicleDefault}">
                                    <span Class="veh-selected text-bold">${vehicleDefault}</span>${vsmHeaderselectNewVehicleLink} 
                                </c:when>
                                <c:otherwise>
                                <c:choose>
		                                <c:when test="${currentLanguage.isocode eq 'fr'}">
		                                    <span Class="veh-selected"><spring:message code="text.search.ptlp.select.a.vehicle" text="Select a vehicle for " /><spring:message code="text.search.ptlp.select.vehicle.fit.parts" text="fit parts" /></span>${vsmHeaderselectAVehicleLink}
		                                </c:when>
	                                	<c:otherwise>
	                                    <span Class="veh-selected"><spring:message code="text.search.ptlp.select.a.vehicle" text="Select a vehicle for " /><b><spring:message code="text.search.ptlp.select.exact.vehicle" text="exact" /></b> <spring:message code="text.search.ptlp.select.vehicle.fit.parts" text="fit parts" /></span>${vsmHeaderselectAVehicleLink}
	                                    </c:otherwise>
	                            </c:choose> 
	                                <c:set var="displayNewVehicleLink">style="display:none"</c:set>Hide if there is no vehicle in header              
                                </c:otherwise>
                            </c:choose>                            
                            
                        </c:set> 
                    </c:otherwise>
                </c:choose>
            </c:otherwise>
        </c:choose>

<div class="nol-row">
    <div class="ncol-xs-12 pad-smv-lft-none pad-smv-top-md">
        <div class="veh-select-header ncol-sm-12 marg-smv-lft-none middle-xs">
            <span class="icon-napa-vehicle mobile-no-display inline-sm-block"></span>
            ${vehSelectHeader}
        </div>
        <div class="veh-select-modal pad-xsv-lft-md nol-slide-content" id="veh-select-modal"
            ${displayVehicleSelectModal}>
            
            <div class="nol-row">
                <div class="ncol-xs-12 nol-row pad-xsv-vrt-md pad-xsv-rgt-none">
                    <div class="change-your-vehicle ncol-xs-7 ncol-sm-2"><spring:message code="text.search.ptlp.select.new.vehicle" text="Select New Vehicle"/></div>
                    <div class="ncol-xs ncol-sm end-xs start-sm pad-xsv-rgt-none marg-xsv-rgt-none">
                        <c:choose>
                        <c:when test="${fn:length(suggestedVehicles) gt 0}">
                            <a class="nol-slide-link" rel="nol-slide-link" data-targetselector="#veh-select-saved"><spring:message code="text.search.ptlp.view.saved.vehicle" text="View My Vehicles" /> (${fn:length(suggestedVehicles)})</a>
                        </c:when>
                        <c:otherwise>
                        <c:if test="${fn:length(inbentaSuggestion) gt 0}">
                            <a class="nol-slide-link" rel="nol-slide-link" data-targetselector="#veh-select-saved"><spring:message code="text.search.ptlp.select.suggested.vehicle" text="Suggested Vehicles" /></a>
                        </c:if>
                        </c:otherwise>
                        </c:choose>
                    </div>
                </div>
            </div>
            
            <div class="nol-row">
                <div class="ncol-md-3 ncol-xs-12">
                    <div class="veh-select-label pad-xsv-vrt-sm"><label for="input-veh-type"><spring:message code="text.vehicle.selector.modal.Vehicle.type" text="Vehicle Type" /></label></div>
                    <div class="veh-select-field">
                        <span class="input-dropdown" rel="input-dropdown">
                            <input id="input-veh-type" name="input-veh-type" type="text" data-next="years"
                                data-endecaid="" data-fieldid="types" class="vsautocomplete" disabled="disabled"
                                placeholder="Select type" />
                        </span><span class="tymm-selected"></span>
                    </div>
                </div>
                <div class="ncol-md-2 ncol-xs-12">
                    <div class="veh-select-label pad-xsv-vrt-sm"> <label for="veh-ymm-year"><spring:message code="vehicle.selector.modal.year.title" text="Year" /></label></div>
                    <div class="veh-select-field ">
                        <span class="input-dropdown" rel="input-dropdown">
                            <input id="veh-ymm-year" name="veh-ymm-year" type="text" data-next="makes" data-endecaid=""
                                class="vsautocomplete" data-fieldid="years" disabled="disabled" placeholder="Select Year" />
                        </span><span class="tymm-selected"></span>
                    </div>
                </div>
                <div class="ncol-md-2 ncol-xs-12">
                    <div class="veh-select-label pad-xsv-vrt-sm"><label for="veh-ymm-make"><spring:message code="vehicle.selector.modal.make.title" text="Make" /></label></div>
                    <div class="veh-select-field">
                        <span class="input-dropdown" rel="input-dropdown">
                            <input id="veh-ymm-make" name="veh-ymm-make" type="text" data-next="models" data-endecaid=""
                                class="vsautocomplete" data-fieldid="makes" disabled="disabled" placeholder="Select Make" />
                        </span><span class="tymm-selected"></span>
                    </div>
                </div>
                <div class="ncol-md-2 ncol-xs-12">
                    <div class="veh-select-label pad-xsv-vrt-sm"> <label for="veh-ymm-model"><spring:message code="vehicle.selector.modal.model.title" text="Model" /></label></div>
                    <div class="veh-select-field">
                        <span class="input-dropdown" rel="input-dropdown">
                            <input id="veh-ymm-model" name="veh-ymm-model" type="text" data-endecaid="" class="vsautocomplete"
                                disabled="disabled" data-fieldid="models" placeholder="Select Model" />
                        </span><span class="tymm-selected"></span>
                    </div>

                </div>
                <div class="ncol-md-2 ncol-xs-12">
                    <div class="pad-xsv-vrt-sm"><label for="veh-ymm-submit">&nbsp;</label></div>
                    <button id="veh-ymm-submit" class="nol-button mobile-fullWidth grey" disabled="disabled" data-searchterm="${keywordInput}" data-currentpagetype="${currentpagetype}"><spring:theme code="vechile.button.select.vehicle" text="Select a Vehicle"/></button>
                </div>
            </div>
        </div>
        <div class="veh-select-saved pad-xsv-lft-md nol-slide-content" id="veh-select-saved" ${displaySavedVehicleModal}>
            
            <div class="nol-row">
            
                <c:if test="${not empty suggestedVehicles}">

                    <c:set var="columns" value="1" scope="page" />
                    <c:set var="innercolumns" value="12" scope="page" />
                    <c:forEach items="${suggestedVehicles}" var="savedVeh" varStatus="loop">
                        <c:if test="${not loop.first and loop.index % 5 == 0}"> 
                            <c:set var="columns" value="${columns + 1 }" scope="page" />
                        </c:if>
                    </c:forEach>
                    <c:if test="${columns gt 6}">
                        <c:set var="columns" value="6" scope="page" />columns*2 Cannot be more than 12
                    </c:if>

                    <fmt:formatNumber var="innercolumns"  value="${innercolumns/columns }"  maxFractionDigits="0" />
                
                    <div class="ncol-md-12">

                        <div class="nol-row">
                            <div class="ncol-xs-12 ncol-sm-2 pad-xsv-top-md pad-smv-top-md"><span class="callout-text"><spring:message code="text.search.ptlp.select.saved.vehicle" text="My Vehicles" /></span></div>
                            <div class="ncol-xs-12 pad-xsv-vrt-sm">
                                <div class="nol-row">
                                
                                    <c:forEach items="${suggestedVehicles}" var="savedVeh" varStatus="loop">
                                        <c:if test="${not loop.first and loop.index % 5 == 0}"> 
                                            </div><div class="ncol-xs-12 ncol-md-${innercolumns} pad-xsv-vrt-sm">
                                        </c:if>
                                        
                                <c:if test="${plpReferer ne true}">
                                            <div class="ncol-xs-12 ncol-md-3">
                                                <span class="saved-vehicles">
                                                    <c:url value="/search" var="vehurl">
                                                    <c:param name="text" value="${savedVeh.value} ${keywordInput}" />
                                                    <c:param name="referer" value="semantic" />
                                                    <c:param name="sveh" value="1" />
                                                    </c:url>
                                                    <a href="${vehurl}" rel="nofollow">${savedVeh.value}</a>
                                                </span>
                                            </div>    
                                    </c:if>
                                <c:if test="${plpReferer eq true}">
                                            <div class="ncol-xs-12 ncol-md-3">
                                                <span class="saved-vehicles">
                                                    <a class="link-blue" rel="vsm-suggestedveh" referer="${currentpagetype}" data-vehicleid="${savedVeh.key}" >${savedVeh.value}</a>
                                                </span>
                                            </div>    
                                  </c:if>
                                        Loop the saved vehicles : End
                                    </c:forEach>
                                </div>
                            </div>
                        </div>

                    </div> 
                </c:if>
                <div class="ncol-xs-12 pad-xsv-vrt-sm">
                    <c:if test="${not empty inbentaSuggestion}">
                        <div class="pad-smv-vrt-sm callout-text"><spring:message code="text.search.ptlp.select.suggested.vehicle" text="Suggested Vehicles" /></div>
                        Loop the suggestted vehicles: Start
                        <div class="nol-row">
                        <c:forEach items="${inbentaSuggestion}" var="inbentaSuggestionItem">
                            <div class="ncol-xs-12 ncol-md-3">
                                <span class="saved-vehicles">
                                     <a class="link-blue" rel="vsm-suggession" data-targetselector="#veh-select-modal"  data-endecaid="${inbentaSuggestionItem.key}" data-suggestion="${inbentaSuggestionItem.value}">${inbentaSuggestionItem.value}</a>
                                </span>
                            </div>
                        </c:forEach>
                        </div> 
                        Loop the suggestted vehicles: End
                    </c:if>
                </div>
            </div>
            
        </div>
        <div class="veh-select-saved" ${displayNewVehicleLink}>
            <span class="saved-vehicles pad-xsv-vrt-md pad-smv-vrt-md pad-smv-lft-sm">
                <a class="nol-slide-link link-blue no-arrow pad-xsv-lft-md pad-xsv-vrt-md" rel="nol-slide-link" data-targetselector="#veh-select-modal" data-clearfields="true">
                    + <spring:message code="text.search.ptlp.select.new.vehicle" text="Select New Vehicle" /></a>
            </span>
        </div>
	    <c:if test="${empty bucketOne and not empty inputVehCondition}">
        <div class="veh-select-saved pad-xsv-md">
            <span class=""><spring:message code="text.search.exactMatch" arguments="<b>${inputVehCondition}</b>" text="Shop additional part types below." /></span>
        </div>
		</c:if>

        <c:if test="${hasVehicleRefinements}">
            <div class="veh-condition-modal pad-xsv-md">
                <div class="nol-row">
                    <div class="ncol-xs-12" style="font-size:1rem"><spring:message code="text.search.ptlp.complete.your.vehicle" text="Complete your vehicle to see Exact Fit products" /></div>
                    <script> var $autocomplete_suggestions = [];</script>
                    <c:forEach var="entry" items="${searchPageData.vehicleRefinements}" varStatus="status">
                        <div class="ncol-md-3 ncol-xs-12">
                            <form id="sort_form1" name="sort_form1" method="get" action="${searchBaseUrl}">
                                <div class="veh-select-label pad-xsv-vrt-sm"><label for="input-veh-type">${entry.key}:</label></div>
                                <div class="veh-select-field">
                                    <span class="input-dropdown" rel="input-dropdown">
                                        <input name="input-q" type="text" class="vcautocomplete" disabled="disabled"
                                            placeholder="${entry.key}" data-autocompleteindex="${status.index}"
                                            data-hiddeninput="hiddeninput_${status.index}" />
                                    </span><span class="tymm-selected"></span>
                                    <input type="hidden" name="q" value="" id="hiddeninput_${status.index}" />
                                    <script>
                                        $autocomplete_suggestions[${status.index}] = [ 
                                        <c:forEach items="${entry.value}" var="refinement">{"data":"${refinement.navigationData}","value":"${refinement.refinementText}"},</c:forEach>
                                        ];
                                </script>
                                </div>
                                <c:if test="${not empty searchText}">
                                    <c:choose>
                                        <c:when test="${not empty endecaCorrectedSearchKeyword}">
                                            <input type="hidden" name="text" value="${endecaSearchKeyword}">
                                        </c:when>
                                        <c:otherwise>
                                        	<input type="hidden" name="text" value="${searchText}">
                                        </c:otherwise>
                                    </c:choose>
                                </c:if>
                                <c:if test="${not empty catId }">
                                    <input type="hidden" name="catId" value="${catId}">
                                </c:if>
                                <c:if test="${not empty catIndex }">
                                    <input type="hidden" name="catIndex" value="${catIndex}">
                                </c:if>
                                <c:if test="${searchPageData.currentQuery.query.application}">
                                    <input type="hidden" name="isApplication" value="${searchPageData.currentQuery.query.application}" />
                                </c:if>
                                <c:if test="${searchPageData.currentQuery.query.product}">
                                    <input type="hidden" name="isProduct" value="${searchPageData.currentQuery.query.product}" />
                                </c:if>
                                <c:if test="${searchPageData.currentQuery.query.interchange}">
                                    <input type="hidden" name="isInterchange" value="${searchPageData.currentQuery.query.interchange}" />
                                </c:if>
                                <c:if test="${not empty seoCategory }">
                                    <input type="hidden" name="sc" value="${seoCategory}">
                                </c:if>
                                <c:if test="${searchPageData.pagination.sort != 'DFLT' }">
                                    <input type="hidden" name="sort" value="${searchPageData.pagination.sort}">
                                </c:if>
                                <c:if test="${searchPageData.pagination.pageSize!=0 and searchPageData.pagination.pageSize!=12}">
                                    <input type="hidden" name="pageSize" value="${searchPageData.pagination.pageSize}">
                                </c:if>
                                <c:if test="${not empty jobId}">
                                    <input type="hidden" name="jobId" value="${jobId}" />
                                </c:if>
                                <c:if test="${not empty indices}">
                                    <input type="hidden" name="indices" value="${indices}" />
                                </c:if>
                                <c:if test="${not empty keyWordInput}">
                                	<input type="hidden" name="keywordInput" value="${keyWordInput}" />
                                	</c:if>
                                <input type="hidden" name="referer" value="nol-veh-conds" />
                            </form>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </c:if>
    </div>
</div>
 --%>